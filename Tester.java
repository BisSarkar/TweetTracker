package Assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");  
		TweetDB tweeetDb=new TweetDB("Creating Tweet Database");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the tweet:");
		int s = Integer.parseInt(sc.nextLine());
	    for(int i=1;i<=s;i++)
	    {
	    	System.out.println("Enter the value of Tweet Id:");
	    	String id=sc.nextLine();
	    	System.out.println("Enter the date(yyyy/MM/dd hh:mm:ss->31/03/2020):");
	    	String tDate=sc.nextLine();
	    	Date tweetDate=null;
	    	 try {  
	    		 tweetDate = formatter.parse(tDate);  
			    } catch (ParseException e) {e.printStackTrace();}  
	    	
	    	System.out.println("Enter the value of tweet text:");
	    	String tweetText=sc.nextLine();
	    	Tweet t = new Tweet(id,tweetDate,tweetText);
	    	tweeetDb.addTweet(t);
	    }
	    
		
	    System.out.println("Size of the list is :"+tweeetDb.getNumberOfTweets());
	    
	    tweeetDb.getSortedTweet();
		for(Tweet tweet :tweeetDb.getTweets())
		{
			 System.out.println(tweet);
		}
		
		System.out.println("Enter the index of the tweet which you want to see:");
		int index = Integer.parseInt(sc.nextLine());
		Tweet t=tweeetDb.getTweet(index);
		System.out.println(t);
		
		
		System.out.println("Enter the value of Tweet Id:");
    	String id=sc.nextLine();
    	System.out.println("Enter the date(yyyy/MM/dd hh:mm:ss->31/03/2020) :");
    	String tDate=sc.nextLine();
    	Date tweetDate1=null;
   	 try {  
   		 tweetDate1 = formatter.parse(tDate);  
		     
		    } catch (ParseException e) {e.printStackTrace();}  
   	
    	System.out.println("Enter the value of tweet text:");
    	String tweetText=sc.nextLine();
    	Tweet tweet = new Tweet(id,tweetDate1,tweetText);
		
		if(tweeetDb.isAlreadyStored(tweet))
		{
			System.out.println("Tweet Present in the tweet database");
		}else
		{
			System.out.println("Tweet not Present in the tweet database");
		}
		
		for(Tweet tweet1 :tweeetDb.getTweets())
		{
			 System.out.println(tweet1);
		}
        sc.close();
	}

}
