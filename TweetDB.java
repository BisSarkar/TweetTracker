package Assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class TweetDB {

	private String comment;
	private ArrayList<Tweet> tweets;

	// Creating constructor with comment and blank default array list

	public TweetDB(String comment) {
		super();
		this.comment = comment;
		tweets = new ArrayList<Tweet>();
	}

	// Adding Tweet object in the list

	public void addTweet(Tweet tweet) {

		tweets.add(tweet);

	}

	// Returns number of Tweet object added in the list

	public int getNumberOfTweets() {
		return tweets.size();
	}

	// Returns the Tweet object in the given index

	public Tweet getTweet(int i) {

		return tweets.get(i);
	}

	/* Sorting the Tweet object based on date & time */

	ArrayList<Tweet> getSortedTweet() {
		Collections.sort(tweets);
		return tweets;
	}

	// Validating given Tweet object in the list

	public Boolean isAlreadyStored(Tweet t) {

		for (Tweet tweet : tweets) {
			if (tweet.equals(t)) {
				return true;
			}
		}
		return false;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ArrayList<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}

}
