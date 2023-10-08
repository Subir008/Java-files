package Practice;

import java.util.Arrays;
import java.util.Scanner;
public class String_anagram {
	
	static boolean checkLength(String s1, String s2)
	{
		if (s1.length() == s2.length())
		{
			return checkWord(s1,s2);
		}
		else {
			System.out.println("Not Anagram");
			return false;
		}
	
	}
	
	static boolean checkWord(String s1, String s2)
	{
		char str1 [] = s1.toCharArray();
		char str2 [] =  s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for (int i = 0 ; i < str1.length; i++)
		{
			if(str1[i]!=str2[i]) {
				return false;
			}
		
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter 1st string");
		String s1 = sc.next();
		System.out.println("Enter 2nd string");
		String s2 = sc.next();
		
		if(checkLength(s1,s2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
		
		
	}

}
