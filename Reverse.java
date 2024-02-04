/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	   
		String s = args[0];
		int l = s.length();
 
 
		for (int i = 1; i <= l; i++) {
			char r = s.charAt(l - i);
			 System.out.print(r);
		}
		int d = 0;
		
		if (l%2 == 1) {d = l / 2;
		} else { 
			d = (l / 2) - 1;
		}
	
			System.out.println('\n' + "The middle character is " + s.charAt(d)); }
 
 
	}
 
