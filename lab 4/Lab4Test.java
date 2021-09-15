/*
* Assessment: Lab 4
* Student Name: Ali Aliyev	
* Due Date: February 8, 2020
* Lab instructor: Dr. James Mwangi
*/
import java.util.Scanner;
public class Lab4Test {


       public static void main(String[] args) {

             //creating an instance for Scanner class

             Scanner input = new Scanner(System.in);

             System.out.println("\nEnter number of librarians: ");

             int num = input.nextInt();

             //creating payroll object for Payroll class with num parameter

             Payroll payroll = new Payroll(num);

             //invoking readLibrarians method

             payroll.readLibrarians();

             System.out.println("\n\nSummary of Payroll Processing");

             System.out.println("================================");

             //invoking processPayroll method

             payroll.processPayroll();

             input.close();

       }

 

}