package socialmediamentions.facebook;

import java.util.Collections;
import java.util.List;

public class FacebookMentions {
    public static List<String> getMentions(String topic) {
        return Collections.singletonList(
                "Facebook: Hillary Clinton is better than Donald Trump"
        );
    }
}
