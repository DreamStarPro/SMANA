package pro.dreamstar.smana;

import twitter4j.TwitterException;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to SMANA!");

        // Retrieve Tweets for a Query
        try {
            List<String> tsunamiTextList = TwitterApp.searchtweets("tsunami");
            System.out.println(tsunamiTextList);
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }

}
