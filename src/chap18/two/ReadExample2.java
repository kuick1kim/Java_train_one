package chap18.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("c:/temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[6];
		readCharNo =reader.read(cbuf, 1,4);
		
		
		for(int i=0; i<cbuf.length; i++) {
			System.out.print(cbuf[i]);
		}
//		System.err.print(data);
		reader.close();

	}

}
