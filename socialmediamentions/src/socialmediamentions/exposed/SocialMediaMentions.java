package socialmediamentions.exposed;

import socialmediamentions.facebook.FacebookMentions;
import socialmediamentions.twitter.TwitterMentions;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class SocialMediaMentions {
    public static List<String> getMentions(String topic) {
        List<String> mentions = new ArrayList<>();
        List<String> facebookMentions = FacebookMentions.getMentions(topic);
        List<String> twitterMentions = TwitterMentions.getMentions(topic);

        mentions.addAll(facebookMentions);
        mentions.addAll(twitterMentions);

        // Getting custom mention services provided by library users
        ServiceLoader.load(MentionsService.class).forEach(
                service ->
                        mentions.addAll(
                                service.getMentions(topic)
                                        .stream()
                                        .map(x -> "(custom) " + x)
                                        .collect(Collectors.toList())
                        )
        );

        return mentions;
    }
}
