/*
Author: Eric Weisinger
Course: CSCI 1082 Object Oriented Programming
Instructor: Zak Baani
Due Date: Feb 13 11:30pm
Description: A program taking the name, date, and content of a tweet 
in three different formats. 
*/
package edu.century.pa2;


public class TweetEntry {
	private String firstname;
	private String lastname;
	private int age;
	private String tweetText;
	private String tweetDate;
	
	
	public TweetEntry() {
		this.firstname = null;
		this.lastname = null;
		this.age = 0;
		this.tweetText = null;
		this.tweetDate = null;
	}
	
	public TweetEntry(String firstname, String lastname, int age, String tweetDate, String tweetText) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.tweetText = tweetText;
		this.tweetDate = tweetDate;
		
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastName() {
		return firstname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setTweetDate(String tweetDate) {
		this.tweetDate = tweetDate;
	}
	
	
	public String getTweetDate() {
		return tweetDate;
	}
	
	public void setTweetText(String tweetText) {
		this.tweetText = tweetText;
	}
	
	public String getTweetText() {
		return tweetText;
	}
	
	
	public boolean equals(TweetEntry tweet1) {
		if (! ( tweet1 instanceof TweetEntry )) {
			return false;
		}
		
		TweetEntry tweet = (TweetEntry) tweet1;
		if (this.tweetText.equals(tweet.tweetText)) {
			return true;
		}
		
		
			return false;
	}
	
	public String getUserName() {
		String username = firstname.substring(0 , 1) + lastname.substring(0 , 1);
		username = username.toLowerCase();
		return username;
	}
	
	public String showMyTweet() {
		
		return  firstname + " " + lastname + "\n@" + getUserName() + "\n" + 
		tweetText.substring(0, 139) + "...";
	}

	
	public String toString() {
		return "\tFirst Name: " + firstname + "\n\tLast Name: " + lastname + "\n\tUserName: #" 
				+ getUserName() + "\n\tDate Started: " + tweetDate;
				
	}
	
	
}
