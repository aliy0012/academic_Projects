import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
* Assessment: Lab 8
* Student Name: Ali Aliyev	
* Due Date: March 28, 2020
* Lab instructor: Dr. James Mwangi
*/
public class Store {
	private Employee[] employees;  //instance variable  Employee array 
	
	/**
	 * 
	 * @param size
	 */
	public Store(int size) {                              //class constructor
		this.employees = new Employee[size];   
		
	}
	
	public void readDetails(Scanner input) {   //readDetails method
		
		int selection = 0;
		int z = 0;

		for(int i = 0; i < employees.length; i ++) {
			do {
				try {
				System.out.printf("Enter details of Employee " + (i+1) + ":\n1. Regular\n2. Contractor :");
				selection = input.nextInt();
				
					if(selection == 1){           //if 1 is entered Regular class object created
                    	employees[i] = new Regular();
                    	employees[i].readInfo(input);
                    	z = 1;
                    	break;

                	}else if(selection == 2){
                    	employees[i] = new Contractor();   //if 2 is entered Contractor class created
                    	employees[i].readInfo(input);
                    	z = 1;
                    	break;

                	}else{
                    	System.out.printf("Wrong Employee Type!");
                    	input.nextLine();
                    	z=0;
                    	i=0;
                    	continue;
                    //other than 1 or 2, wrong type.
                	}
				}
				catch(InputMismatchException e2) {
					System.err.println("*****Input Mismatch Exception while reading number of employees*****");
					input.nextLine();
					i=0;
					continue;
					}
			}while(z != 1 );
			}
	}
	//printing output method
	public void printDetails(String storeName) {
		if(employees[0] != null) {
				printTitle(storeName);
				for(int i = 0; i < employees.length; i++) {
				employees[i].printInfo(); }
			}else
				{System.out.println("*** No elements in Array *****");
				}
		}
	public void printLine() {
		System.out.print("\n=====================================================================");
	}
	
	public void printTitle(String storeName) {
		System.out.print(storeName + " Store Management System");   //printing store name
		printLine();
		System.out.printf("\n\n%7s %17s %15s %15s %15s", "Emp#|", "Name |", " Email |", " Phone |", " Salary |");
		
	}
	
	public void readFile() {
		try {
			File myFile = new File("src/employees.txt");
			Scanner scan = new Scanner(myFile);
			for(int i = 0; i < employees.length; i++) {
				String firstChar = scan.next();
				if(firstChar.equalsIgnoreCase("r")) {
					employees[i] = new Regular(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.nextLong(), scan.nextDouble());
				}else if(firstChar.equalsIgnoreCase("c")) {
					employees[i] = new Contractor(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.nextLong(), scan.nextDouble(),scan.nextDouble());	
				}
			}scan.close();
	
		}catch(FileNotFoundException e) {
			System.err.println("*****No file found *****");	
		}catch(NoSuchElementException e2) {
			System.err.println("*****No such element eception*****");
		}
		
				
	}

}
