package pl.com.sobsoft.mongo.training;

import java.util.List;
import java.util.Random;

public class RandomData {

    public static Random random = new Random();

    public static <T> T getRandomFrom(List<T> values) {
        return values.get(random.nextInt(values.size()));
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
