package FileSystem;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{ 
			Reader reader=new FileReader("write.txt");
			int data =reader.read();
			while(data!=-1)
			{
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
