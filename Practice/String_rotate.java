// Take 2 string from user one normal and 1 rotated and one input for how many rotation
// rotate the normal string and check both the output are same or not.

package Practice;

//import java.util.Iterator;
import java.util.Scanner;
public class String_rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		System.out.println("Enter rotated String");
		String s2 = sc.next();
		System.out.println("Enter rotate time");
		int r = sc.nextInt();
		
		char [] arr = s1.toCharArray();
		char temp ;
		 
		for(int j = 0; j < r; j++) {
		for(int i = 0; i < arr.length-1; i++)
		{
			temp = arr[i];
			arr[i]= arr[i+1];
			arr[i+1]= temp;
		}
		}
		String s = "";
		
		for (int i = 0; i < arr.length; i++) {
			s = s + arr[i];
		}
		System.out.println("Output String " +s);
		if (s2.equals(s))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
