/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int var1 = Integer.parseInt(args[0]);
		String ans = var1 + " is a perfect number since " + var1 + " = 1";
		
		int sum = 1;

		for (int i = 2; i < var1; i++) {
			if (var1 % i == 0) { 
				sum = sum + i;
				ans = ans + " + " + i;}
			}
			System.out.println(ans);

			if (var1 != sum) {
				System.out.println(var1 + " is not a perfect number");
			}
	}
}





// int divisors = 0;
 
 
// 		for (int i = 1; i <= whole; i++) {
// 			if (whole % i == 0) { divisors = i;
// 				System.out.println(divisors);
// 			}