import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * Console Objects Tester 
 * Used to test Assignment 4 classes
 * @author Cordell Bonnieux
 *
 */
public class ConsoleObjectsTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		
		while (!exit) {
			System.out.println("Which would you like to test? (please enter a number) "
					+ "\n test rectangles (exercise 7 pt1): 1 \n test rectangles & billboards (exercise 7 pt2): 2"
					+ "\n test sorting by perimeter using comparator (exercise 8): 3"
					+ "\n exit: 4 \n");
			String input = scan.nextLine();
			int choice = 0;
			
			try {
				choice = Integer.valueOf(input);
			} catch (Exception e) {
				System.out.println("Invalid input, try again.");
			}
			
			switch(choice) {
				case 1:testRectangles();
					break;
				case 2:testRectanglesAndBillboards();
					break;
				case 3:testSortByPerimeter(getMockShapes());
					break;
				case 4: System.out.println("Goodbye!");
					exit = true;
					break;
			}
		}
		scan.close();
		System.exit(0);;
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
		System.out.println("\n \n \n ************ unsorted shapes ************ \n \n \n");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].drawForConsole());
		}
		
		// Sort, then print them again
		Arrays.sort(list);
		System.out.println("\n \n \n ************ sorted shapes ************ \n \n \n");
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
		System.out.println("************ Rectangles and Billboards: ************\n");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].drawForConsole());
		}
	}
	
	/**
	 * Test Sort By Perimeter
	 * Exercise 8
	 * Used to test PerimeterComparator
	 * @param list, an ArrayList of ConsoleShapes
	 */
	private static void testSortByPerimeter(ArrayList<ConsoleShape> list) {
			
		System.out.println("************ unsorted shapes ************\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).drawForConsole());
		}
		
		System.out.println("************ shapes sorted by perimeter (descending order) ************\n");
		Collections.sort(list, new PerimeterComparator());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).drawForConsole());
		}
	}
	
	/**
	 * Data used to test testSortPerimeter()
	 * @return ArrayList of ConsoleShapes
	 */
	private static ArrayList<ConsoleShape> getMockShapes() {
		ArrayList<ConsoleShape> list = new ArrayList<ConsoleShape>();
		list.add(new ConsoleRectangle(10,10,true));
		list.add(new ConsoleRectangle(20,20,false));
		list.add(new ConsoleRectangle(60,40,true));
		list.add(new ConsoleRectangle(6,12,true));
		list.add(new ConsoleRectangle(30,33,false));
		list.add(new ConsoleRectangle(90,60,true));
		list.add(new ConsoleRectangle(69,69,false));
		list.add(new ConsoleRectangle(42,69,true));
		list.add(new ConsoleRectangle(14,12,false));
		
		return list;
	}
}
