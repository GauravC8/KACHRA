package FileSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileWriter writer = new FileWriter("names.txt",true);
			BufferedWriter br = new BufferedWriter(writer);
			br.write("james");
			br.write("\n");
			br.write("Hobert");
			br.close();
			System.out.println("Successfully written to file");			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
