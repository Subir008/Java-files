package File_handling;

import java.io.File;
import java.io.IOException;

public class Folder_create {

	public static void main(String[] args) throws IOException
	{
		
		File f1 = new File("D:/Coding/JAVAA/src/File_Handling1");
		if (f1.mkdirs()) 
		{
			System.out.println("Folder Created");
			if (f1.exists())
			{
				System.out.println("Folder is existed");
			}
		}else {
			System.out.println("Folder not created");
		}
	}
}