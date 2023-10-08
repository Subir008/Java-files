package Practice;

public class PerfectNumber {
	public static void main(String [] args)
	{
	for(int i = 1 ; i <= 100 ; i++)
	{
	     int copy = i;
	     int sum = 0;
	     int num = i;
	     for (int j = 1 ; j <i ; j++)
	  {
	     if ( i % j == 0)
	     {
	         sum = sum+ j;
	     }
	  }
	  if(i == sum)
	  {
		  System.out.println(i + "Perfect");
	  }
	}
	}

}
