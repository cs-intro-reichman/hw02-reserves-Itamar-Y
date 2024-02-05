
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		double child1 = Math.random();
		double child2;
		int boys = 0;
		int girls = 0;
		String children = "";

		// if (child1 > 0.5) {
		// 	boys += 1;
		// 	children += "b ";
		// } else {
		// 	girls += 1;
		// 	children += "g ";
		// }
		
		do {
			child2 = child1;
			child1 = Math.random();
			if (child1 > 0.5) {
				boys += 1;
				children += "b ";
			} else {
				girls += 1;
				children += "g ";
			}
		} while (boys == 0 || girls == 0);




		

	int children_amount = boys + girls;
	System.out.println(children);
	// System.out.println(children_amount);


 System.out.println("You made it... and you now have " + children_amount + " children.");
	
	}
}
