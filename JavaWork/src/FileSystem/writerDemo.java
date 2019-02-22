package FileSystem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class writerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{ 
			Writer w=new FileWriter("D:\\KACHRA\\JavaWork\\src\\FileSystem\\write.txt");
			String content = "She sells seashells in the sea";
			w.write(content);
			w.close();
			System.out.println("File written");
		}catch(IOException e) {e.printStackTrace();}

	}

}
