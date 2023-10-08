package Task;

import java.util.Scanner;

public class Convert_to_upper {
	
	static String convert(String s1) {
		
		String s2 = "";
		for (int i = 0; i <s1.length(); i++)
		{
			if (i == (s1.length() - 1)/2)
			{
				s2 = s2 + Character.toUpperCase(s1.charAt(i));
			}
			else {
				s2 = s2 + s1.charAt(i);
			}	
		}
		return s2;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
	
		String s1 = sc.next();
		String s = convert(s1);
		
		System.out.println(s);

	}

}
