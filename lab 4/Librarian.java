/*
* Assessment: Lab 4
* Student Name: Ali Aliyev	
* Due Date: February 8, 2020
* Lab instructor: Dr. James Mwangi
*/
public abstract class Librarian {
	
	protected String firstName = "";  //instance variables
	protected String lastName = "";
	protected String email = "";
	protected double hoursPerWeek;
	
	public Librarian() {  //default constructor for class
		
	}
	public Librarian(String firstName, String lastName, String email, double hoursPerWeek) {  //overload constructor with parameters
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public abstract double payrollCalculations();  //abstract method of super class
	
	public abstract void methodOfPayment(); 
	
	
		
	}


