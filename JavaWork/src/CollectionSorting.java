import java.util.*;

public class CollectionSorting {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java For Developers");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");

		Collections.sort(al);

		System.out.println("List after the use of" + " Collection.sort() :\n" + al);
		int pos = Collections.binarySearch(al, "Superb");
		System.out.println("The position of \"Superb\" in Arraylist is :" + pos);

		Collections.reverse(al);
		System.out.println("List after the Reversing" + al);

		Collections.swap(al, 4, 1);
		System.out.println("List after the SWaping" + al);

	}
}