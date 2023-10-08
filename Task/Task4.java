package Task;

//Fetching the even and odd ones
//checking which one is bigger and divide the bigger one by the smaller ones
//Then doing factorial of the quotient
//then sum of digit
//then rev the number
//finally converting the int to alphabet using aschii value


public class Task4 {

	public static void main(String[] args) {
		
		int arr [] = { 5,10,22,3,42};
		int sum_even = 0;
		int sum_odd = 0;
		int div = 1;
		int fact = 1;
		int sum_digit = 0;
		int rev = 0 ;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				sum_even = sum_even + arr[i];
				System.out.println(sum_even);
			}
			else
			{
				sum_odd = sum_odd + arr[i];
				System.out.println(sum_odd);
			}
		}
		
		if (sum_even > sum_odd) 
		{
			div = sum_even / sum_odd ;
		}else
		{
			div = sum_odd / sum_even ;
		}
		System.out.println(div);

		for (int i = 1; i <= div; i++)
		{
			fact = fact * i ;
		}
		System.out.println(fact);
		
		while (fact != 0)
		{
			int rem = fact % 10 ;
			sum_digit = sum_digit + rem ;
			fact = fact / 10 ;
		}
		System.out.println(sum_digit);
		
		while (sum_digit != 0)
		{
			int rem = sum_digit % 10 ;
			rev = rev * 10 + rem ;
			sum_digit = sum_digit / 10;
		}
		System.out.println(rev);
		
		char ch = (char) rev ;
		System.out.println(ch);
		
	}

}
