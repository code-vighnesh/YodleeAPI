package me.vighnesh.api.yodlee.db;

import com.mongodb.client.MongoDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    public void getMongoDB() {
        MongoDatabase mongoDB = Database.getMongoDB();
        Assertions.assertNotNull(mongoDB, "mongoDB should not be null");
        Assertions.assertEquals("Yodlee", mongoDB.getName(), "mongoDB.getName() should match");
    }
}
