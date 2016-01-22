package pl.com.sobsoft.mongo.training;

public class DataGenerator {


    public static void main(String[] args) {
        final AccountCreator accountCreator = new AccountCreator();

        accountCreator.createAccounts(100);
    }

}
