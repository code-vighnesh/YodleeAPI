package me.vighnesh.api.yodlee.service;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import me.vighnesh.api.yodlee.dao.provider.Provider;
import me.vighnesh.api.yodlee.dao.provider.Providers;
import me.vighnesh.api.yodlee.db.Database;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.sort;
import static java.util.Arrays.asList;

public class ProviderDAO {

    public static void save(Providers providers) {
        MongoDatabase database = Database.getMongoDB();

        if (Objects.isNull(database.getCollection("providers")))
            database.createCollection("providers");

        MongoCollection<Document> collection = database.getCollection("providers");
        System.out.println("Collection providers selected successfully");
        if (!Objects.isNull(providers)) {
            List<Document> documents = new ArrayList<>();
            for (Provider provider : providers.getProvider()) {
                Document document = new Document()
                        .append("id", provider.getId())
                        .append("name", provider.getName())
                        .append("baseUrl", provider.getBaseUrl())
                        .append("countryISOCode", provider.getCountryISOCode());
                documents.add(document);
            }
            collection.insertMany(documents);
            System.err.println("Providers inserted successfully");
        }
    }

    public static String query() {

        MongoCollection<Document> collection = Database.getMongoDB().getCollection("providers");
        System.err.println("Collection providers selected successfully");

        Bson group = group("$countryISOCode", sum("count", 1));
        Bson sort = sort(new Document("countryISOCode", 1));
        AggregateIterable<Document> output = collection.aggregate(asList(group, sort));

        StringBuilder builder = new StringBuilder();
        for (Document document : output) {
            builder.append(String.format("\"%s\": %d", document.get("_id"), document.get("count")))
                    .append(",");
        }
        String out = builder.toString();
        return out.substring(0, out.length() - 1);
    }
}
