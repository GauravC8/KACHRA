import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java For Developers");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");
		// sort
		Collections.sort(al);
		System.out.println("List after the use of" + " Collection.sort() :\n" + al);
		// binarySearch
		int pos = Collections.binarySearch(al, "Superb");
		System.out.println("The position of \"Superb\" in Arraylist is :" + pos);
		// reverse
		Collections.reverse(al);
		System.out.println("List after the Reversing" + al);
		// swap
		Collections.swap(al, 4, 1);
		System.out.println("List after the SWaping" + al);

	}
}