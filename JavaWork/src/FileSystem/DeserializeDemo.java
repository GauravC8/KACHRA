package FileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = null;
		try {
			FileInputStream finput = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(finput);
			e = (Employee) in.readObject();
			in.close();
			finput.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee Class Not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee Object");
		System.out.println("Name :" + e.name);
		System.out.println("Address :" + e.address);
		System.out.println("SSN :" + e.SSN); //provide 0 because SSN is not serialized //transient
	}

}
