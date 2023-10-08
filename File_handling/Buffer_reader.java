package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_reader {

	public static void main(String[] args)throws IOException
	{
		
		File f1 = new File("D:/Coding/JAVAA/src/File_Handling1/File1.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		String s1 = br.readLine();
		while (s1 != null)
		{
			System.out.println(s1);
			s1 = br.readLine();
		}
		
	}

}
