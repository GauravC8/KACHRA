package Java8;

import java.util.HashMap;
import java.util.Map;

public class LamdaDemo5 {

	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		books.put("Let Us C", "Yashwant Kanetkar");
		books.put("OOP using JAVA", "Simmon Kendal");
		books.put("JAVA:GUI","Devid Etheridge");
		
		books.forEach((key,value)->System.out.println("Books Name:-"+key+" , Author:-"+value));
		
		System.out.println();
		/*books.forEach(System.out::println);*/

	}

}
