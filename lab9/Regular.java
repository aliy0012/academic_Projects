import java.util.Scanner;

/*
* Assessment: Lab 9
* Student Name: Ali Aliyev	
* Due Date: April 04, 2021
* Lab instructor: Dr. James Mwangi
*/
public class Regular extends Employee{
	protected double salary = 0.0;  //class instance variable
	
	/**
	 * overriding printInfo method
	 * @param input
	 */
	public Regular(){
	}
	/**
	 * 
	 * @param number
	 * @param name
	 * @param lastName
	 * @param email
	 * @param phone
	 * @param salary
	 */
	public Regular(int number, String name, String lastName, String email, long phone, double salary) {
		super.employeeNumber = number;
		super.firstName = name;
		super.lastName = lastName;
		super.email = email;
		super.phoneNumber = phone;
		this.salary = salary;
	}
	@Override
	public void readInfo(Scanner input) {
		super.readInfo(input);
		
		System.out.print("Enter anual salary: ");
		this.salary = (input.nextDouble()/12);
		
		System.out.print("");
	}
	
	@Override
	public void printInfo() {    //overriding print method
		super.printInfo();
		System.out.printf("%13.2f  |", this.salary);

	}

}
