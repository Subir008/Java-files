// Same as Task9

package Task;
import java.util.*;

public class Task10 {

	static void prime()
	{
		ArrayList a1 = new ArrayList();
		for (int i = 10 ; i <= 20 ; i++)
		{
			boolean flag = true;
			for (int j = 2; j <i ; j++)
			{
				if (i%j == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag == false)
			{
				a1.add(i);
			}
		}
		System.out.println(a1);
	}
	public static void main(String[] args) {
		
		prime();
		
	}

}
