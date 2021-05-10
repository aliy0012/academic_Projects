
public class Numbers {
	
	int[] numbers; //instance variable numbers array
	
	public Numbers(int size) { //constructor, receives value named size, and sets array with that size
		
		numbers = new int[size];
		
	}
	public void generateNumbers() { //method to fill the array
		for( int i = 0; i > numbers.length-1; i++) {
					numbers[i] = i;
		}
	}
	public void printNumbers() { //method to output array elements
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.print(i + " ");
		}
	}
	

}
