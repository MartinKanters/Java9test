package socialmediamentions.exposed;

import socialmediamentions.facebook.FacebookMentions;
import socialmediamentions.twitter.TwitterMentions;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaMentions {
    public static List<String> getMentions(String topic) {
        ArrayList<String> mentions = new ArrayList<>();
        List<String> facebookMentions = FacebookMentions.getMentions(topic);
        List<String> twitterMentions = TwitterMentions.getMentions(topic);

        mentions.addAll(facebookMentions);
        mentions.addAll(twitterMentions);

        return mentions;
    }
}
