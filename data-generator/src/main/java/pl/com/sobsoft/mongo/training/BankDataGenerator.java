package pl.com.sobsoft.mongo.training;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static java.time.Instant.now;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.util.Date.from;
import static pl.com.sobsoft.mongo.training.Data.*;
import static pl.com.sobsoft.mongo.training.RandomData.*;

public class BankDataGenerator {

    public static void main(String[] args) {
        BankDataGenerator bankDataGenerator = new BankDataGenerator();
        bankDataGenerator.createAndSavePersonsWithAccounts(5000);
    }

    public void createAndSavePersonsWithAccounts(int howMany) {

        final MongoClient mongoClient = new MongoClient();
        final MongoDatabase db = mongoClient.getDatabase("training");
        final MongoCollection<Document> accountsCollection = db.getCollection("accounts");

        for (int i = 0; i < howMany; i++) {
            Document person = new Document();
            final String gender = getRandomFrom(GENDER);
            if (isMale(gender)) {
                person.append("first_name", getRandomFrom(FIRST_NAMES_MALE));
            } else {
                person.append("first_name", getRandomFrom(FIRST_NAMES_FEMALE));
            }

            person.append("last_name", getRandomFrom(LAST_NAMES))
                    .append("joined", from(now().minus(getRandomNumber(2000), DAYS)))
                    .append("personal", new Document()
                                    .append("mother_name", getRandomFrom(FIRST_NAMES_FEMALE))
                                    .append("father_name", getRandomFrom(FIRST_NAMES_MALE))
                                    .append("gender", gender)
                                    .append("birth_date", from(now().minus(1000 + getRandomNumber(100 * 365), DAYS)
                                            .minus(getRandomNumber(60 * 24), MINUTES)))
                    );

            if (getRandomNumber(20) < 1) {
                person.append("vip", true);
            }

            List<Document> bankAccounts = createBankAccounts(getRandomNumber(5));
            if (!bankAccounts.isEmpty()) {
                person.append("accounts", bankAccounts);
            }

            accountsCollection.insertOne(person);
            System.out.println("Inserted " + (i + 1) + " documents");
        }
    }

    private boolean isMale(String gender) {
        return "male".equals(gender);
    }

    private List<Document> createBankAccounts(int randomNumber) {
        List<Document> accountDocuments = new ArrayList<>();
        for (int i = 0; i < randomNumber; i++) {
            Document account = new Document("type", getRandomFrom(ACCOUNT_TYPES))
                    .append("account_balance", getRandomDouble(100000))
                    .append("currency", getRandomFrom(CURRENCIES));
            accountDocuments.add(account);
        }
        return accountDocuments;
    }

}
