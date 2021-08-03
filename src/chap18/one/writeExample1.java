package chap18.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class writeExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		byte[] data = "ABCDEF".getBytes();
		for(int i=0; i<data.length;i++) {
				os.write(data[i]);
		}
//		System.err.print(data);
		os.flush();
		os.close();

	}

}
