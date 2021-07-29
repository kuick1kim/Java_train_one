package chap16.two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("d:/kjw_data/");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p-> System.out.println(p.getFileName()));

	}

}
