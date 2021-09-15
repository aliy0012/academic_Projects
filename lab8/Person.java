import java.util.Scanner;

/*
* Assessment: Lab 8
* Student Name: Ali Aliyev	
* Due Date: March 28, 2020
* Lab instructor: Dr. James Mwangi
*/

public abstract class Person {
	
	//instance variables
	protected String firstName = "";
	protected String lastName = "";
	protected String email = "";
	protected long phoneNumber = 0L;
	
	public Person() {
		//class constructor
	}
	
	/**
	 * overload constructor with parameters
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 */
	public Person(String firstName, String lastName, String email, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * readinfo method accepting scannerinput
	 * @param input
	 */
	public void readInfo(Scanner input) {
		System.out.print("Enter first name: ");
		this.firstName = input.next(); //assigning user input as first name
		
		System.out.print("Enter last name: ");
		this.lastName = input.next();   //getting lastname fromuser
		
		System.out.print("Enter email: ");
		this.email = input.next();  //getting email address
		
		System.out.print("Enter phone number: ");
		this.phoneNumber = input.nextLong();  //getting phone number
	}

	/**
	 * abstract method
	 */
	public abstract void printInfo();   //abstract method, with no body

}
