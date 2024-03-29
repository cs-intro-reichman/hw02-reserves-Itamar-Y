import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		double children_amount = 0;

		int fam2 = 0;
		int fam3 = 0;
		int fam4 = 0;

		for (int i = 0; i < T; i++) {
			boolean boy = false;
			boolean girl = false;
			int count = 0;
				/*OneOfEach.java code */
			while (!(boy && girl)) {
				double child1 = generator.nextDouble();
				if (child1 > 0.5) {
					boy = true;
				} else {
					girl = true;
				}
				count ++;
			} 

			children_amount = children_amount + count;

		if (count == 2) {
			fam2 ++;
		} else {
				if (count == 3) {
			fam3 ++;
				} else {
			fam4 ++;
		}
	}

		}
		double average = children_amount / T;
		

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + fam2);
		System.out.println("Number of families with 3 children: " + fam3);
		System.out.println("Number of families with 4 or more children: " + fam4);

		int MostCommon = 0;

	if (fam2 > fam3) {
		System.out.println("The most common number of children is 2.");
		} else {
			if (fam4 > fam3) {
				System.out.println("The most common number of children is 4 or more.");
			} else {
				System.out.println("The most common number of children is 3.");
			}
		}
	}
}

	

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    

