package FileSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//mark() method of BufferedReader class. 
//Basically we mark the stream and use the reset method to go back to the marked index.

public class BufferedReaderMarks {

	public static void main(String[] args) {
		System.out.print("Enter Characters: ");
		// declare the BufferedReader Class
		// used the InputStreamReader to read the console input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// catch the possible IOException by the read() method
		try {

			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			reader.mark(6);
			System.out.println("Printing characters after mark");
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			reader.reset();
			System.out.println("Printing characters after reset");
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			// close the BufferedReader object
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}