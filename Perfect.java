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

			if (var1 != sum) {
				ans = var1 + " is not a perfect number";
			}

			System.out.println(ans);
	}
}