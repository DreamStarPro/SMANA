package pro.dreamstar;

import twitter4j.*;

import java.util.List;
import java.util.stream.Collectors;

class tweetSmana {


    // Search for tweets
    static List<String> searchTweets(Twitter twitterS, String text) throws TwitterException {

        Query query = new Query(text);
        QueryResult result = twitterS.search(query);

        return result.getTweets().stream()
                .map(Status::getText)
                .collect(Collectors.toList());
    }

}
