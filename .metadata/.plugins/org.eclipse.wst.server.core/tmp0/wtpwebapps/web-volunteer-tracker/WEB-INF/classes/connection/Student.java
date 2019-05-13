package com.jdbc.connection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {



private int id;
private String firstName;
private String lastName;
private String email;
private String gender;
private String phonenum;

private String message = "Error validating Information";

public Student(int id, String firstName, String lastName, String email, String gender, String phonenum) {

	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.gender = gender;
	this.phonenum = phonenum;
	
}


public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}


public Student(String firstName, String lastName, String email, String gender, String phonenum) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.gender = gender;
	this.phonenum = phonenum;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getPhonenum() {
	return phonenum;
}


public void setPhonenum(String phonenum) {
	this.phonenum = phonenum;
}


public boolean validate()
{
	
	if(firstName.trim().length()<1)
	{
		message="Please enter first name";
		return false;
		
	}
	
	if(lastName.trim().length()<1)
	{
		message="Please enter last name";
		return false;
		
		
	}
	

	if(email.trim().length()<1 || !(email.contains("@")) || !(email.contains(".")) )
	{
		message="Please enter valid email address";
		return false;
		
	}
	
	String regex = "^(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	 
	Pattern pattern = Pattern.compile(regex);
	
	Matcher matcher=pattern.matcher(phonenum);
	
	if(phonenum.trim().length()<10 || !(matcher.matches()) )
	{
		message="Please enter valid phone num";
		return false;
		
	}
	
	return true;
}

@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", gender=" + gender + ", phonenum=" + phonenum + "]";
}






}
