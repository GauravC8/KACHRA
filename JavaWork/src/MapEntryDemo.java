import java.util.HashMap;
import java.util.Map;

public class MapEntryDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "John");
		hm.put(101, "Jonney");
		hm.put(102, "Janardhan");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
