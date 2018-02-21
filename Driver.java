/*
Author: Eric Weisinger
Course: CSCI 1082 Object Oriented Programming
Instructor: Zak Baani
Due Date: Feb 13 11:30pm
Description: A program taking the name, date, and content of a tweet 
in three different formats. 
*/
package edu.century.pa2;


public class Driver {
	
	
	
	public static void main (String[] args) { 
		
		String tweet = "The start date of the summer semester is just around the corner. "
				+ "\nI want to welcome all of you ahead of our class meeting. " +
				"\nI am looking forward to working with all of you, and I hope we will have a " 
				+ "great semester.";
		
		TweetEntry tweet1 = new TweetEntry("John" , "Smith" , 24 , "Thu Jun 01 19:36:55 CDT 2017" , tweet);
		
		System.out.print("First Name: ");
		System.out.println(tweet1.getFirstName());
		
		System.out.print("Last Name: ");
		System.out.println(tweet1.getLastName());
		
		System.out.print("Age: ");
		System.out.println(tweet1.getAge());
		
		System.out.print("Username: ");
		System.out.println(tweet1.getUserName());
		
		System.out.print("Date: ");
		System.out.println(tweet1.getTweetDate());
		
		System.out.print("Tweet Text: ");
		System.out.println(tweet);
		
		System.out.println();
		System.out.println();
		
		System.out.println(tweet1.showMyTweet());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Profile Summary: ");
		System.out.println(tweet1.toString());
		
		
	}

	
		
	}


