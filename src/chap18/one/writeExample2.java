package chap18.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class writeExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("c:/temp/test2.txt");
		byte[] data = "ABCDEF 김민상2".getBytes();
		os.write(data);		
		os.flush();
		os.close();

	}

}
