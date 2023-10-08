package Task;

import java.util.Scanner;

public class Second_unique {

	static String uniqe1(String s1)
	{
		String s2 = "";
		String s3 = "";
		
		for(int i = 0; i < s1.length(); i++)
		{
			int count = 0;
			for (int j = 0; j <s1.length(); j++)
			{
				if (s1.charAt(i) == s1.charAt(j))
				{
					count ++;
				}
			}
			if (count == 1 )
			{
				s2 = s2 + s1.charAt(i);
			}
		}
		for (int k = 0 ; k < s2.length(); k++)
		{
			if (k == 1)
			{
				s3 = s3 + s2.charAt(k);
			}
		}
		return s3;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String s1 = sc.next();
		String c = uniqe1(s1);
		System.out.println(c);
	}
}
