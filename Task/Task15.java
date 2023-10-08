package Task;
import java.util.*;
public class Task15 {

	
	static void range(int start,int end)
	{
		ArrayList a1 = new ArrayList<>();
		
		
		for (int i = start; i <= end; i++) 
		{
			int fact = 1;
			
			for (int j = 1; j <= i; j++)
			{
				fact = fact * j;
				
			}
			a1.add(fact);
			
		}
		System.out.println();
		System.out.println(a1);
		
		
		
	}
	
	public static void main(String[] args) {
		range(1,5);
	}
	
}
