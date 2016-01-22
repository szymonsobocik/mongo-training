package pl.com.sobsoft.mongo.training;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static pl.com.sobsoft.mongo.training.Data.*;

public class AccountCreator {

    public void createAccounts(int howMany) {

        final MongoClient mongoClient = new MongoClient();

        final MongoDatabase bankDB = mongoClient.getDatabase("bank");

        for (int i = 0; i < howMany; i++) {
            bankDB.getCollection("accounts").insertOne(new Document("first_name", getRandomFrom(FIRST_NAMES))
                    .append("last_name", getRandomFrom(LAST_NAMES)));
        }
    }

}
