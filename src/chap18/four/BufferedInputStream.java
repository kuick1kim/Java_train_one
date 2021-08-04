package chap18.four;

import java.io.FileInputStream;

public class BufferedInputStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long start= 0;
		long end =0;
		FileInputStream fis1 = new FileInputStream("C:/temp/img1/1.zip");
				
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {	}
		end = System.currentTimeMillis();
		System.out.println("사용 않을때" + (end-start) + "ms");
		fis1.close();
		
		
		FileInputStream fis2 = new FileInputStream("C:/temp/img1/1.zip");
				
		java.io.BufferedInputStream bis =new java.io.BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {	}
		end = System.currentTimeMillis();
		System.out.println("사용 할때" + (end-start) + "ms");
		bis.close();
		fis2.close();
	}

}
