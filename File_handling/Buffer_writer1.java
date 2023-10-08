package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_writer1 {
	
	public static void main(String[] args)throws IOException
	{
		File f1 = new File("D:/Coding/JAVAA/src/File_Handling1/File.pdf");
		
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		bw.write("Hii");
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("Bye");
		
		bw.flush();
		
		String s1 = br.readLine();
		
		while (s1 != null)
		{
			System.out.println(s1);
			s1 = br.readLine();
		}
		
		
	}
	
	
	
	


}
