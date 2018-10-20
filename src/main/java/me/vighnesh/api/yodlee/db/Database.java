package me.vighnesh.api.yodlee.db;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import me.vighnesh.api.yodlee.configuration.Configuration;

public class Database {
    private static final Configuration configuration = Configuration.getConfig();
    // Creating a Mongo client
    private static final MongoClientURI uri = new MongoClientURI(configuration.getSecrets().getDatabaseSecrets().getUri());
    private static final MongoClient mongo = new MongoClient(uri);
    private static final MongoDatabase database = mongo.getDatabase("Yodlee");

    public static MongoDatabase getMongoDB() {
        return database;
    }
}
