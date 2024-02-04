/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int whole = Integer.parseInt(args[0]);
 
 
		int divisors = 0;
 
 
		for (int i = 1; i <= whole; i++) {
			if (whole % i == 0) { divisors = i;
				System.out.println(divisors);
			}
		}
	}
 }
 
