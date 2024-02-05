// /**
//  *  Computes some statistics about families in which the parents decide 
//  *  to have children until they have at least one child of each gender.
//  *  The program expects to get one command-line argument: an int value
//  * 	that determines how many families to simulate.
//  */
public class OneOfEachStats1 {
	public static void main (String[] args) {

		int T = Integer.parseInt(args[0]);

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
				double child1 = Math.random();
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
		System.out.println("Number of families with 4 children or more: " + fam4);

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

	
