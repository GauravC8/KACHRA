package FileSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InpustStreamToFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream is = new FileInputStream("write.txt");
			OutputStream os = new FileOutputStream("D:/");
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = is.read(buffer)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
