package javaconcepts;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class WhatIsAClass {
	/*
	 * Classes have attributes and behaviors
	 * 
	 */

	//attributes
	String name;
	int age;
	char gender;
	
	//Behavior
	//eat, read, run, sleep
	
	public void eat() {
		System.out.println(name + " eats");
	}
	
	public void read() {
		if(gender == 'F') {
			System.out.println(name + " is reading and she is " + age + " years old.");
		}else if( gender == 'M') {
			System.out.println(name + " is reading and he is " + age + " years old.");
		}else {
			System.out.println("seriously, make up your mind!");
		}
	}
	
	public int run() {
		return 10;
	}
	
	public char getInitial() {
		return name.charAt(0);
	}
	
	public int year() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int yearBorned = currentYear - age;
		return yearBorned;
	}
	
	public String greet(String name) {
		return "Hello " + name;
	}
}
