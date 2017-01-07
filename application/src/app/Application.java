package app;

import exposed.SocialMediaMentions;
import facebook.FacebookMentions;

public class Application {
    public static void main(String... args) {
        String topic = "Donald Trump";

        System.out.println("All mentions: ");
        SocialMediaMentions
                .getMentions(topic)
                .forEach(System.out::println);

        System.out.println("\nMentions only from facebook: ");
        FacebookMentions
                .getMentions(topic)
                .forEach(System.out::println);
    }
}
