package FileSystem;
import java.io.Serializable;

//serelizedemo

public class Employee implements Serializable {
	String name;
	String address;
	transient int SSN;
	public void mailCheck()
	{
		System.out.println("Mailing a check to "+ name +" "+ address);
	}
}
