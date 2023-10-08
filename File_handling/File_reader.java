package File_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_reader {

	public static void main(String[] args) throws IOException
	{
		File f1 = new File("D:/Coding/JAVAA/src/File_Handling1/File.txt");
		FileReader fr = new FileReader(f1);
		char ch [] = new char [(int) f1.length()];
		fr.read(ch);
		String s1 = new String(ch);
		System.out.println(s1);
		
		
	}
}
