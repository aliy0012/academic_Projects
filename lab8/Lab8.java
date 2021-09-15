import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Assessment: Lab 8
* Student Name: Ali Aliyev	
* Due Date: March 28, 2020
* Lab instructor: Dr. James Mwangi
*/
public class Lab8 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter name of Store: ");  //asking store name
		String storeName = input.next();  //geting store name from scanner

		boolean check = true;
		int size = 0;

		do {                                      //do while loop, for user to enter correct number
            try {
                System.out.print("How many employees do you have? ");
                size = input.nextInt();
                if (size > 0) {  //if number is positive, loops breaks
                    check = true;
                    break;
                } else {
                    System.out.print("Enter a positive number: "); //if not positive, asks to enter positive number
                    check = false;
                    input.nextLine();  //discarding bad input
                }
            } catch (InputMismatchException e) {  //catch block for other than number inputs
                System.out.println("*****Input Mismatch Exception while reading selection of process*****");
                input.nextLine(); // discarding bad input
                check = false;
            }
        }while (!check);
		
		Store store1 = new Store(size);
		input.nextLine();
		int selection = 0;

		do {          //asking user to select from menu
			try {
				System.out.print("\n1. Read Employee Details from the User\n2. Read Details From the File\n3. Print Employee Details\n4. Quit\nEnter your option: ");
				selection = input.nextInt();
				switch (selection) {
				case 1: { //if 1 is selected, employee information asked
					store1.readDetails(input);
					input.nextLine();
					break;}
				case 2: {
					store1.readFile();  //case2, reads from file
					break;}		
				case 3:  {//in 3 case, prints employee info
					store1.printDetails(storeName);
					System.out.println();
					input.nextLine();
					break;}
				case 4: {                        //case 4, quits program
					System.out.println("Have a good day!");
					System.exit(0);
					break;}
				default: {
					System.out.print("Wrong menu selection\n");
					System.out.print("Please enter menu options 1 to 3: ");
					input.nextLine();
					break;}
				}
			} catch (InputMismatchException e) {
				System.err.println("*****Input Mismatch Exception while reading selection of process*****");
				input.nextLine();
			}
		} while (selection != 4);
		System.out.println("Have a good day!");
		input.close();        //closing scanner
	}
}
