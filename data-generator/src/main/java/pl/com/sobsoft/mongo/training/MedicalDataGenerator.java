package pl.com.sobsoft.mongo.training;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

import static pl.com.sobsoft.mongo.training.Data.*;
import static pl.com.sobsoft.mongo.training.RandomData.getRandomFrom;
import static pl.com.sobsoft.mongo.training.RandomData.getRandomNumber;

public class MedicalDataGenerator {

    public static void main(String[] args) {
        MedicalDataGenerator medicalDataGenerator = new MedicalDataGenerator();
        medicalDataGenerator.generateMeds(50 * 1000 * 100);

    }

    private void generateMeds(int howMany) {

        final MongoClient mongoClient = new MongoClient();
        final MongoDatabase db = mongoClient.getDatabase("training");
        final MongoCollection<Document> accountsCollection = db.getCollection("meds");

        for (int i = 0; i < howMany; i++) {
            Document med = new Document();
            med.append("_id", i)
                    .append("drug_name", getRandomFrom(DRUGS_GENERIC))
                    .append("quantity", getRandomNumber(100000))
                    .append("unit", getRandomFrom(UNITS))
                    .append("manufacturer", new Document()
                            .append("name", getRandomFrom(DRUGS_COMPANY))
                            .append("city", getRandomFrom(CITIES))
                            .append("country", getRandomFrom(COUNTRIES)))
                    .append("forbidden_countries", getRandomFrom(COUNTRIES, getRandomNumber(10)))
                    .append("category", getRandomNumber(100))
                    .append("sub-category", getRandomNumber(1000));

            accountsCollection.insertOne(med);
            System.out.println("Inserted " + (i + 1) + " documents");
        }


    }


}
