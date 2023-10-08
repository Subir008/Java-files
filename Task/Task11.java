// Fetch the fibonacci series 
// Store in collection

package Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {

	static ArrayList fibo(int x)
	{
		ArrayList a1 = new ArrayList();
		int a = 0;
		int b = 1;
		int c ;
		a1.add(a);
		a1.add(b);
		for (int i = 0; i <= x ; i++)
		{
			c = a+b;
			a = b;
			b = c;
			a1.add(c);
			
		}
		return a1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int y = sc.nextInt();
		
		System.out.println(fibo(y));
	}

}
