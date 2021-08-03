package chap18.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("c:/temp/test.txt");
		int readByteNo;
		
		byte[]readBytes = new byte[40];
				
			readByteNo = is.read(readBytes,1,36);
			for(int i=0; i<readBytes.length;i++) {
				System.out.print((char)readBytes[i]);
		}
//		System.err.print(data);
		is.close();

	}

}
