import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Assessment: Lab 9
* Student Name: Ali Aliyev	
* Due Date: April 04, 2021
* Lab instructor: Dr. James Mwangi
*/
public class Employee extends Person {
	
	protected int employeeNumber = 0;  //instance variable of class
	
	public Employee() {  //class constructor with no  parameters
		
	}
	
	/**
	 * 	overload constructor with parameters
	 * @param number
	 * @param name
	 * @param lastName
	 * @param email
	 * @param phone
	 */
	public Employee(int number,  String name, String lastName, String email, long phone) {
		super(name, lastName, email, phone);
		this.employeeNumber = number;
		
	}
	@Override
	public void readInfo(Scanner input) {
		super.readInfo(input);  //calling Person classreadInfo method
		
		try{System.out.print("Enter employee Number: ");
			this.employeeNumber = input.nextInt();           //getting employee number
		}catch(InputMismatchException e) {
			System.out.print("*****Input Mismatch Exception while reading number of employees*****");
		}
	}


	@Override
	public void printInfo() {
		System.out.printf("\n\n%7s %17s %15s %15s", this.employeeNumber + "|", (this.firstName + " " + this.lastName) +"|", this.email + "|", this.phoneNumber + "|");
	}
}
