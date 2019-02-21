
//StudentComparator
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<StudentComparator> ar = new ArrayList<StudentComparator>();
		ar.add(new StudentComparator(111, "a", "lONDON"));
		ar.add(new StudentComparator(112, "b", "Paris"));
		ar.add(new StudentComparator(113, "C", "Delhi"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar, new Sortbyname());
		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
