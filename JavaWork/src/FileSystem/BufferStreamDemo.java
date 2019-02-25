package FileSystem;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fout = new FileOutputStream("D:\\KACHRA\\JavaWork\\write.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Sehwag is my favourite player";
		byte b[] = s.getBytes();
		bout.write(b);

		bout.flush();
		bout.close();
		fout.close();
		System.out.println("successfully write by buffered output streams");
	}
}
