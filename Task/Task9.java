// Fetch the prime number between 10-20
// Store in the collection.

package Task;

import java.util.ArrayList;

public class Task9 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		for (int i = 10; i <= 20; i++) {
			int flag =0;
			
			for (int j = 2; j <= i/2; j++)
			{
				if (i % j == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				a1.add(i);
			}
		}
		System.out.println(a1);

	}

}
