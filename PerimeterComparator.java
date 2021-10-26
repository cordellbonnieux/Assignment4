import java.util.Comparator;
/**
 * PerimeterComparator
 * Compares ConsoleShapes by perimeter
 * @author Cordell Bonnieux
 *
 */
public class PerimeterComparator implements Comparator<ConsoleShape> {
	
	/**
	 * Compare
	 * Compares ConsoleShapes by perimeter
	 * @return int - 0 if one == two; negative if one < two ; positive if one > two
	 */
	@Override
	public int compare(ConsoleShape one, ConsoleShape two) {
		return Double.compare(two.getPerimeter(), one.getPerimeter());
	}

}
