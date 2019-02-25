package FileSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		
		//from file employee.java
		
		//serializing the object.
		Employee e = new Employee();
		e.name ="Micheal Jackson";
		e.address = "Costa Ricka";
		e.SSN =111122233;
		//e.number =101;
		try
		{
			FileOutputStream fout = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e);
			out.close();
			fout.close();
			System.out.println("Serialzed data is saved in employee.ser");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
