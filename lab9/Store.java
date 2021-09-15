
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
* Assessment: Lab 9
* Student Name: Ali Aliyev	
* Due Date: April 04, 2021
* Lab instructor: Dr. James Mwangi
*/
public class Store {
	protected ArrayList<Employee> employees;
	
	public Store() {                              //class constructor
		employees =  new ArrayList<Employee>();  
		
	}
	/**
	 * 
	 * @param input
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void readDetails(Scanner input) throws IOException, ClassNotFoundException {   //readDetails method
		
		int selection = 0;
		int i = employees.size();

			do {
				try {					
						System.out.printf("Enter details of Employee " + (i+1) + ":\n1. Regular\n2. Contractor :");
						selection = input.nextInt();
						
				
							if(selection == 1){           //if 1 is entered Regular class object created
								Regular regular1 = new Regular();
								regular1.readInfo(input);
								employees.add(regular1);	
								i++;
                    		break;

							}else if(selection == 2){
								Contractor contractor1 = new Contractor();
								contractor1.readInfo(input);
								employees.add(contractor1);
								i++;
								break;

							}else{
								System.out.printf("Wrong Employee Type!");
								input.nextLine();           	
								i++;
								continue;
								//other than 1 or 2, wrong type.
							}
				
				}catch(InputMismatchException e2) {
					System.err.println("*****Input Mismatch Exception while reading number of employees*****");
					input.nextLine();
					continue;
					}
				}while(i <= employees.size());
			
			}
	
	/**
	 * 
	 * @param storeName
	 * @throws IOException
	 * @throws NullPointerException
	 */
	//printing output method
	public void printDetails(String storeName) throws IOException, NullPointerException, IndexOutOfBoundsException{
		if(employees.size() != 0) {
				printTitle(storeName);
				for(Employee e : employees) {
					e.printInfo();}
		}else
				{System.out.println();
				System.out.println("No employees added yet");}
				
		}
	
	public void printLine() {
		System.out.print("\n=====================================================================");
	}
	
	public void printTitle(String storeName) {
		System.out.print(storeName + " Store Management System");   //printing store name
		printLine();
		System.out.printf("\n\n%7s %17s %15s %15s %15s", "Emp#|", "Name |", " Email |", " Phone |", " Salary |");
		
	}
	/**
	 * 
	 * @throws IOException
	 * @throws NoSuchElementException
	 */
	public void readFile() throws IOException, NoSuchElementException, NullPointerException{
		int i = 0;
		try {
			File myFile = new File("src/employees.txt");
			Scanner scan = new Scanner(myFile);			
			while(scan.hasNext()) {
				String firstChar = scan.next();
				if(firstChar.equalsIgnoreCase("r")) {
					Regular regular = new Regular(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.nextLong(), scan.nextDouble());
					employees.add(regular);
				}else if(firstChar.equalsIgnoreCase("c")) {
					Contractor contractor = new Contractor(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.nextLong(), scan.nextDouble(),scan.nextDouble());
					employees.add(contractor);
				}
				i++;
			}scan.close();
	
		}catch(FileNotFoundException e) {
			System.err.println("*****No file found *****");	
		}
		
				
	}

}
