package chap16.two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.stream.Stream;

import javax.print.DocFlavor.STRING;

public class FromFileCintentExample  {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/kjw_data/linedata.txt");
		Stream<String> stream;
		
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out :: println);
		System.out.println();
		
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out:: println);
		

	}

}
