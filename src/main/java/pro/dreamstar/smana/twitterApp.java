package pro.dreamstar.smana;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class twitterApp {


    public static Twitter getTwitterinstance() {
        //Twitter Configuration
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("your consumer key")
                .setOAuthConsumerSecret("your consumer secret")
                .setOAuthAccessToken("your access token")
                .setOAuthAccessTokenSecret("your access token secret");
        TwitterFactory tf = new TwitterFactory(cb.build());
        tf.getInstance();
        Twitter twitter;


        twitter = TwitterFactory.getSingleton();
        return twitter;

    }

    // Search for tweets
    public static List<String> searchtweets() throws TwitterException {
        Twitter twitter = getTwitterinstance();
        Query query = new Query("source:twitter4j baeldung");
        QueryResult result = twitter.search(query);
        List<Status> statuses = result.getTweets();
        return statuses.stream().map(
                item -> item.getText()).collect(
                Collectors.toList());
    }
}
