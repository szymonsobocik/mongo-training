package pl.com.sobsoft.mongo.training;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

import static pl.com.sobsoft.mongo.training.Data.*;
import static pl.com.sobsoft.mongo.training.RandomData.*;

public class BankDataGenerator {

    public static void main(String[] args) {
        BankDataGenerator bankDataGenerator = new BankDataGenerator();
        bankDataGenerator.createAndSavePersonsWithAccounts(5);
    }

    public void createAndSavePersonsWithAccounts(int howMany) {

        final MongoClient mongoClient = new MongoClient();

        final MongoDatabase bankDB = mongoClient.getDatabase("bank");

        for (int i = 0; i < howMany; i++) {
            Document person = new Document("first_name", getRandomFrom(FIRST_NAMES))
                    .append("last_name", getRandomFrom(LAST_NAMES))
                    .append("personal", new Document()
                            .append("mother_name", getRandomFrom(FIRST_NAMES))
                            .append("father_name", getRandomFrom(FIRST_NAMES))
                            .append("birth_date", LocalDate.from(Instant.now().minus(getRandomNumber(100 * 365), ChronoUnit.DAYS)).atStartOfDay())
                    );

            List<Document> bankAccounts = createBankAccounts(getRandomNumber(5));
            if (!bankAccounts.isEmpty()) {
                person.append("accounts", bankAccounts);
            }

            bankDB.getCollection("accounts").insertOne(person);
            System.out.println("Inserted " + i + "documents");
        }
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
