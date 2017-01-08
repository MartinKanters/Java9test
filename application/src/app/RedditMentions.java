package app;

import socialmediamentions.exposed.MentionsService;

import java.util.Collections;
import java.util.List;

public class RedditMentions implements MentionsService {
    @Override
    public List<String> getMentions(String topic) {
        return Collections.singletonList("Reddit: Bernie Sanders should've won instead of Donald Trump!!!");
    }
}
