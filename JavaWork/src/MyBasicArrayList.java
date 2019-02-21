import java.util.ArrayList;
import java.util.Collections;

public class MyBasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("JAVA");
		al.add("C++");
		al.add("Python");
		al.add("PHP");
		System.out.println(al);
		System.out.println("Element at Index 1..." + al.get(1));
		System.out.println("Does list contains JAVA... " + al.contains("JAVA"));
		al.add(2, "C");

		System.out.println("\n" + al);
		System.out.println("IS Array Empty...." + al.isEmpty());
		System.out.println("Index of PHP is..." + al.indexOf("PHP"));
		Collections.sort(al);

		System.out.println("\n" + al);
	}

}
