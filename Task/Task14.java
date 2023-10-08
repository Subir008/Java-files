package Task;

public class Task14 {
	static int range(int start,int end)
	{
		int fact1[]= new int[end];
		int sum = 0;
		for (int i = start; i <= end; i++) 
		{
			int fact = 1;
			
			for (int j = 1; j <= i; j++)
			{
				fact = fact * j;
				
			}
			fact1[i-1]=fact;
			System.out.print(fact+" ");
		}
		System.out.println();
		for (int i = 0; i < fact1.length; i++)
		{
			sum = sum + fact1[i];
		}
		System.out.println("Sum "+sum);
		
		return arms(sum);
	}
	static int arms(int x)
	{
		int copy = x;
		int sum = 0;
		while (x != 0)
		{
			int rem = x % 10;
			sum = sum + rem*rem*rem;
			x= x / 10;
		}
		if (copy == sum)
		{
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong");
		}
		return x;
		
	}

	public static void main(String[] args) {
		range(1,5);

	}

}
