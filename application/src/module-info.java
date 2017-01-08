module app {
  requires socialmediamentions;
  provides socialmediamentions.exposed.MentionsService with app.RedditMentions;
}