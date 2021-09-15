/*
* Assessment: Lab 4
* Student Name: Ali Aliyev	
* Due Date: February 8, 2020
* Lab instructor: Dr. James Mwangi
*/

public class Fulltime extends Librarian {
	protected double hourlyRate= 30.00;
	protected double deductionRate = 0.17;
	protected String methodOfPayment = "Direct Deposit";
	
	
	public Fulltime(String firstName, String lastName, String email, double hoursPerWeek) {
		super(firstName, lastName, email, hoursPerWeek);
				
		
	}
	@Override
	public double payrollCalculations() {
		return (this.hourlyRate * super.hoursPerWeek * (1 - this.deductionRate) + (5 * super.hoursPerWeek/5));
	}
	
	@Override
	public void methodOfPayment() {
		System.out.println(this.methodOfPayment + " " + this.payrollCalculations() + " to " + super.firstName + " " + super.lastName);
	}

}
