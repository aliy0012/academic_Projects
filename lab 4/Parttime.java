/*
* Assessment: Lab 4
* Student Name: Ali Aliyev	
* Due Date: February 8, 2020
* Lab instructor: Dr. James Mwangi
*/
public class Parttime extends Librarian {
	protected double hourlyRate = 45.00;   //instance variables 
	protected double taxRate = 0.15;
	protected String methodOfPayment = "Mailed a cheque";
	
	
	public Parttime(String firstName, String lastName, String email, double hoursPerWeek) {
		super(firstName, lastName, email, hoursPerWeek);
	}


	@Override //ovveride method for partime class
	public double payrollCalculations(){ //weekly partime payrol
		 return this.hourlyRate * super.hoursPerWeek* (1-this.taxRate) + 10*(super.hoursPerWeek/4);
		
	}
	
	@Override  //override method 
	public void methodOfPayment() {
		System.out.println(this.methodOfPayment + " " + this.payrollCalculations() + " to " + super.firstName + " " + super.lastName);
	}

}
