/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int num1 = (int) ( 10.0 * Math.random()); 

		do {
			int num2 = (int) ( 10.0 * Math.random()); 
			int num3 = (int) ( 10.0 * Math.random()); 
			int num4 = (int) ( 10.0 * Math.random()); 
		} while (num1 <= num2; num2 <= num3; num3 <= num4)
			
		if (num2) {System.out.println(num1 + '\n' num2);}
		
		}
		
	

		System.out.println();

	}

