package pl.com.sobsoft.mongo.training;

import java.util.*;

public class RandomData {

    public static Random random = new Random();

    public static <T> T getRandomFrom(List<T> values) {
        return values.get(random.nextInt(values.size()));
    }

    public static <T> List<T> getRandomFrom(List<T> values, int howMany) {
        Set<T> results = new HashSet<>();
        if (howMany < 1) {
            return null;
        }

        for (int i = 0; i < howMany; i++) {
            results.add(getRandomFrom(values));
        }

        return new ArrayList<>(results);
    }

    public static int getRandomNumber(int min, int max) {
        return random.ints(min, max).findFirst().getAsInt();
    }

    public static int getRandomNumber(int max) {
        return random.nextInt(max);
    }

    public static Double getRandomDouble(int max) {
        return (double) random.nextInt(max * 100) / 100;
    }
}
