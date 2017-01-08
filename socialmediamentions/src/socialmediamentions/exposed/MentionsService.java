package socialmediamentions.exposed;

import java.util.List;

public interface MentionsService {
    List<String> getMentions(String topic);
}
