/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int num1 = (int) ( 10.0 * Math.random()); 
		int num2;

		do {
			System.out.print(num1 + " ");
			num2 = num1;
			num1 = (int) ( 10.0 * Math.random()); 

		} while (num2 <= num1);
		
		}
	
	}

