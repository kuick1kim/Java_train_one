package chap18.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class writeExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("c:/temp/test2.txt");
		char[] data = "홍길동".toCharArray();
		for (int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
			
		writer.flush();
		writer.close();

	}

}
