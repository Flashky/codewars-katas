package com.codewars.katas.kyu7;

public class Student {
	  private String firstName = "";
	  private String lastName = "";
	  public String studentNumber = "";
	 
	  public Student(String firstName, String lastName, String studentNumber) {
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.studentNumber = studentNumber;
	  }
	  
	  public String getFullName() {
	    return firstName + " " + lastName;
	  }
	  
	  public String getCommaName() {
	    return lastName + ", " + firstName;
	  }
	}

