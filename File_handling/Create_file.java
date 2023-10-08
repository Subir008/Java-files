package File_handling;

import java.io.File;
import java.io.IOException;

public class Create_file {
	public static void main(String[] args) {
		
		File f1 = new File("D:/Coding/JAVAA/src/File_Handling1/File.txt");
		
		try {
			if (f1.createNewFile())
			{
				System.out.println("File Created");
			}
			else {
				System.out.println("File is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
