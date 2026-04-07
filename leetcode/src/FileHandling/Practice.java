package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		BufferedReader bw = new BufferedReader(new FileReader("data.txt"));
//		String line = null;
//		while((line=bw.readLine())!=null)
//		{
//			System.out.println(line);
//		}
//		bw.close();
		
		
		
		
		Files.writeString(Path.of("data.txt"), "adding a new line \n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		String line  = Files.readString(Path.of("data.txt"));
		System.out.print(line);
		
	}

}
