package chap18.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class writeExample4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("c:/temp/test2.txt");
		String data = "안녕 자바 프로그램";
		
		writer.write(data,2,3);

		writer.flush();
		writer.close();

	}

}
