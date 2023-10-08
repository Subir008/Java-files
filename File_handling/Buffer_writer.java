package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_writer {

	public static void main(String[] args)throws IOException
	{
		File f1 = new File("D:/Coding/JAVAA/src/File_Handling1/File1.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("CORE JAVA");
		bw.newLine();
		bw.newLine();
		bw.write("COMPLETED");
		bw.flush();
		
	}

}
