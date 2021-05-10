import java.util.Arrays;

public class Numbers {
	
	
	int[] numbers;
	int[][] squares;  //inctance variables
	
	
	public Numbers(int size) {  //constructor
		
		numbers = new int[size];	
	
	}
	
	
	public Numbers(int row, int col) {  //constructor with row and col variables, to create 2d array
		
		squares = new int[row][col];
		
	}
	
	

	public void generateNumbers(){  //method to generate numbers
		
		
		for(int i = 0; i <= numbers.length-1; i++) {
			
			numbers[i] = i; 
		}		
	}
	
	public void printNumbers() {     //method to output numbers
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(i +", ");
		}		
	}
	
	public void printIndices(){  //method to print indices
		
		for(int row = 0; row < squares.length; row++) {   //for loop for row
			for(int col = 0; col < squares.length; col++) {  //nested for loop for col, runs till the length of object
				System.out.print(row + ",");
				System.out.print(col + " ");
				System.out.print(" ");
			}	
			System.out.printf("%n");
		}			
	}	
	
	public void generateSquares(){  //method to generate squares
		
		for(int row = 0; row < squares.length; row++) {
			 for(int col = 0; col < row; col++) {
				 
				 squares[row][col] = (int) Math.pow((Integer.valueOf(String.valueOf(row)+String.valueOf(col))), 2);
				 
				 
			 }
		}		
	}
		
	public void printSquares() {  //method to print squares
		
		for(int row = 0; row < squares.length; row++) {
			 for(int col = 0; col < row; col++) {
				 System.out.print(squares[row][col] + " ");				 
			 }
		System.out.printf("%n");
		}
	}
	
	
	public void printStarsPattern1(){  //method to print stars
		
		for(int row = 0; row < squares.length; row++) {
			 for(int col = 0; col < row; col++) {
				 System.out.printf("%s","* ");			 
			 }
		System.out.printf("%n");
		}
	}
	
	
	public void printStarsPattern2(){  //method to print lower part of star triangle
	
		for(int row = squares.length; row > 0; row--) {
			 for(int col = 0; col < row; col++) {
				 System.out.printf("%s","* ");			 
			 }
		System.out.printf("%n");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
