package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
	String name, role;

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User name=" + name + ", role=" + role + "\n";
	}

	private static List process(List<User> users, Predicate<User> predicate) {
		// TODO Auto-generated method stub
		List<User> result = new ArrayList<User>();
		for (User user : users)
			if (predicate.test(user))
				result.add(user);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		users.add(new User("John", "Admin"));
		users.add(new User("Alice", "Admin"));
		users.add(new User("Tony", "IronMan"));
		List admins = process(users, (User u) -> u.getRole().equals("Admin"));
		System.out.println(admins);
	}

}
