package chap18.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("c:/temp/test.txt");
		int readData;
		
		
		while(true) {
			readData = reader.read();
			if(readData == -1)break;
				System.out.print((char)readData);
		}
//		System.err.print(data);
		reader.close();

	}

}
