package pl.com.sobsoft.mongo.training;

import javax.swing.text.Document;
import java.util.HashSet;
import java.util.List;

public class DataGenerator {

    public static void main(String[] args) {

        printUniqueStrings(Data.STREET_NAMES);


    }

    private static void printUniqueStrings(List<String> nonUniqueStrings) {

        final HashSet<String> uniqueStrings = new HashSet<>(nonUniqueStrings);

        System.out.println("Non unique values " + nonUniqueStrings.size());
        System.out.println("Unique values " + uniqueStrings.size());

        final String join = String.join("\",\"", uniqueStrings);

        System.out.println(join);

    }

}
