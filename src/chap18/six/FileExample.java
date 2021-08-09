package chap18.six;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Path path = Paths.get("C:/temp/test1.txt");
		System.out.println("디렉토리 여부  :" + Files.isDirectory(path));
		System.out.println("파   일 여부  :" + Files.isRegularFile(path));
		System.out.println("마지막수정시간  :" + Files.getLastModifiedTime(path));
		System.out.println("파   일 크기  :" + Files.size(path));
		System.out.println("소   유   자  :" + Files.getOwner(path));
		System.out.println("숨김파일 여부  :" + Files.isHidden(path));
		System.out.println("읽기가능 여부  :" + Files.isReadable(path));
		System.out.println("쓰기가능 여부  :" + Files.isWritable(path));

	}

}
