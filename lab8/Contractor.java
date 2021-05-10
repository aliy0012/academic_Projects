import java.util.Scanner;

/*
* Assessment: Lab 8
* Student Name: Ali Aliyev	
* Due Date: March 28, 2020
* Lab instructor: Dr. James Mwangi
*/
public class Contractor extends Employee{
	
	protected double hourlyRate = 0.0;   //class instance variables
	protected double numHours = 0.0;
	
	public Contractor() {
	}
	/**
	 * 
	 * @param number
	 * @param name
	 * @param lastName
	 * @param email
	 * @param phone
	 * @param hourlyRate
	 * @param numHours
	 */
	public Contractor(int number, String name, String lastName, String email, long phone, double hourlyRate, double numHours) {
		super.employeeNumber = number;
		super.firstName = name;
		super.lastName = lastName;
		super.email = email;
		super.phoneNumber = phone;
		this.hourlyRate = hourlyRate;
		this.numHours = numHours;	
	}
	@Override
	public void readInfo(Scanner input) {  //overriding readInfo method
		super.readInfo(input);
		
		System.out.print("Enter hourly rate: ");  //getting hourly rate from user
		this.hourlyRate = input.nextDouble();
		
		System.out.print("Enter number of hours worked: ");  //getting hours from user 
		this.numHours = input.nextDouble();
		
	}
	
	@Override    
	public void printInfo() {  //overriding printInfo
		super.printInfo();
		System.out.printf("%13.2f  |", (this.hourlyRate * this.numHours));
	}

}
