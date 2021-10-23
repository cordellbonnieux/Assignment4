import java.util.Arrays;
/**
 * Console Objects Tester 
 * Used to test Assignment 4 classes
 * @author Cordell Bonnieux
 *
 */
public class ConsoleObjectsTester {
	public static void main(String[] args) {
		
		//testRectangles();
		testRectanglesAndBillboards();

	}
	
	/**
	 * Test Console Rectangles
	 * Exercise 7 pt 1
	 */
	private static void testRectangles() {
		ConsoleShape[] list = {
				new ConsoleRectangle(5, 8, true),
				new ConsoleRectangle(3, 3, false),
				new ConsoleRectangle(10, 10, true),
				new ConsoleRectangle(10, 8, false),
				new ConsoleRectangle(7, 5, true),
				new ConsoleRectangle(3, 9, false),
				new ConsoleRectangle(12, 12, true),
				new ConsoleRectangle(1, 1, false),
				new ConsoleRectangle(10, 20, false),
				new ConsoleRectangle(30, 12, false),
				new ConsoleRectangle(14, 7, false)
		};
		// Print Rectangles to console
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].drawForConsole());
		}
		// Sort, then print them again
		Arrays.sort(list);
		System.out.println("\n \n \n ************ list is now sorted ************ \n \n \n");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].drawForConsole());
		}
	}
	
	
	/**
	 * Test Console Rectangle and Billboards
	 * Exercise 7 pt 2
	 */
	private static void testRectanglesAndBillboards() {
		ConsoleDrawable[] list = {
				new ConsoleRectangle(3, 8, true),
				new ConsoleRectangle(16, 3, false),
				new ConsoleRectangle(14, 15, true),
				new ConsoleRectangle(55, 33, false),
				new ConsoleRectangle(12, 5, true),
				new ConsoleRectangle(9, 9, false),
				new Billboard("Hello there!"),
				new Billboard("I pity the fool!"),
				new Billboard("Take it or leave it"),
				new Billboard("You're luggage"),
				new Billboard("First rule is: be nice to mommy."),
				new Billboard("Here is a longer one, to show that a billboard can be very long, so long really that it does not make much sense!"),
		};
		// Print Rectangles and Billboards to console
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].drawForConsole());
		}
	}
}
