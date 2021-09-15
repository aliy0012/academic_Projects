/*
* Assessment: Lab 4
* Student Name: Ali Aliyev	
* Due Date: February 8, 2020
* Lab instructor: Dr. James Mwangi
*/
import java.util.Scanner;

public class Payroll extends Librarian {
	private Librarian[] librarians;  // array of librarian class
	
	Scanner scan = new Scanner(System.in);	
	
	public Payroll(int size) {
	this.librarians = new Librarian[size]; //creating Librarian array object with size
	}
	
	
public void readLibrarians() {
		
		for(int i = 0; i < librarians.length; i++) {
			System.out.println("\nEnter details of librarian: " + (i+1)+ "\n=====================================");
			
			System.out.printf("Enter First Name: ");
			super.firstName = scan.next();  //getting first name
			
			
			System.out.printf("Enter Last Name: ");  //getting last name
			super.lastName = scan.next();
			
	
			System.out.printf("Enter Email: "); //getting email
			super.email = scan.next();
		
			System.out.printf("Enter Hours Worked: ");  //asking hours worked
			super.hoursPerWeek = scan.nextDouble();
		
			System.out.printf("\n1. Fulltime \n2. Parttime\nEnter Type: ");  //asking if part or full time
			 int choose = scan.nextInt();
			 
			  if(choose == 1) { //if 1 selected fulltime object created
	                librarians[i] = new Fulltime(firstName, lastName, email, hoursPerWeek);
	                
	            }else if(choose == 2) { //if 2 selected partime object created
	                librarians[i] = new Parttime(firstName, lastName, email, hoursPerWeek);
	                
	            }        	
		}
		
	}
	
	
	public void processPayroll() {  //printing details of librraians
		
		for(int i = 0; i < librarians.length; i++) {
			if(librarians[i] != null) {
				librarians[i].methodOfPayment();
			}
		}
	}


	@Override
	public double payrollCalculations() {
		return 0;
	}


	@Override
	public void methodOfPayment() {
		
	}
	

}
