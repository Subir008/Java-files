package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_writer {

	public static void main(String[] args) throws IOException
	{
		File f1 = new File("D:/Coding/JAVAA/src/File_Handling1/File.pdf");
		FileWriter fw = new FileWriter(f1);
		fw.write("Hello JAVA");
		fw.flush();
	}
}
