package Assignment3;

import java.util.Date;

@SuppressWarnings("rawtypes")
public class Tweet implements Comparable {

	private String userID;
	private Date date;
	private String tweet;

	public Tweet(String userID, Date date, String tweet) {
		super();
		this.userID = userID;
		this.date = date;
		this.tweet = tweet;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTweet() {
		return tweet;
	}

	public void setTweet(String tweet) {
		this.tweet = tweet;
	}

	@Override
	public int compareTo(Object o) {

		if (getDate() == null || ((Tweet) o).getDate() == null) {
			return 0;
		}
		return getDate().compareTo(((Tweet) o).getDate());
	}

	@Override
	public String toString() {
		return "Tweet [userID=" + userID + ", date=" + date + ", tweet=" + tweet + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tweet other = (Tweet) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (tweet == null) {
			if (other.tweet != null)
				return false;
		} else if (!tweet.equals(other.tweet))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}

}
