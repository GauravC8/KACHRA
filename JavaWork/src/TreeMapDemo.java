import java.util.Map;
import java.util.TreeMap;

class User implements Comparable<User> {
	String first;
	int id;
	String last;

	public User(String first, String last, int id) {
		super();
		this.first = first;
		this.last = last;
		this.id = id;
	}

	@Override
	public String toString() {
		return first + "\t" + last + "\t" + id;
	}

	@Override
	public int compareTo(User o) {
		return (this.first).compareTo(o.first);
	}
}

public class TreeMapDemo {
	public static void main(String[] args) {
		// Natural ordering of User
		Map<User, String> userMap = new TreeMap<>();
		populateUserMap(userMap);
		// System.out.println(userMap.toString());
		diplayMap(userMap);
	}

	private static void diplayMap(Map<User, String> userMap) {
		// Set<User> keySet = userMap.keySet();

		for (User user : userMap.keySet()) {
			System.out.println(user.toString());

		}
	}

	private static void populateUserMap(Map<User, String> userMap) {
		userMap.put(new User("Ani", "kari", 12), "My Name1");
		userMap.put(new User("Cal", "Pall", 15), "My Name2");
		userMap.put(new User("XYZ", "ABC", 22), "My Name3");
		userMap.put(new User("SSS", "lll", 1), "My Name4");
	}
}
