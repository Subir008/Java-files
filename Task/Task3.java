package Task;

// Fetching the odd & even no from array and doing sum of digit and 
// at last converting the int number to roman number

class Even{
	static int eve (int x) 
	{
		int sum= 0 ;
		while (x != 0)
		{
			int rem  = x % 10;
			sum = sum + rem;
			x = x / 10 ;
		}
		System.out.println(sum);
		return sum ;
	}
}

class Odd{
	static int od (int y) 
	{
		int sum= 0 ;
		while (y != 0)
		{
			int rem  = y % 10;
			sum = sum + rem*rem;
			y = y / 10 ;
		}
		System.out.println(sum);
		return sum;
	}	
}

class IntegerToRoman   
{  
	static void intToRoman(int num)   
		{  
			System.out.println("Integer: " + num);  
			int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
			String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
			StringBuilder roman = new StringBuilder();  
			for(int i=0;i<values.length;i++)   
				{  
					while(num >= values[i])   
						{  
							num = num - values[i];  
							roman.append(romanLetters[i]);  
						}  
				}  
			System.out.println("Corresponding Roman Numerals is: " + roman.toString());  
		}  
}

public class Task3 
{

	public static void main(String[] args) 
	{
		int arr [] = {120,143,205,222};
		int sum_even = 0;
		int sum_odd = 0;
		int sum_od = 0;
		int mult = 1 ;
		
		for (int i = 0; i < arr.length; i++)
		{
			
				if (arr[i] % 2 == 0)
				{
					int sum = Even.eve(arr[i]);
					sum_even = sum_even + sum;
					
				}
				else 
				{
					int sum = Odd.od(arr[i]);
					sum_odd = sum_odd + sum;
				}
				
		}
		System.out.println(sum_odd);
		
		while (sum_odd != 0)
		{
			int rem = sum_odd % 10;
			sum_od = sum_od + rem ;
			sum_odd = sum_odd / 10 ;
		}
	
		System.out.println(sum_even);
		System.out.println(sum_od);
		
		mult = sum_even * sum_od;
		System.out.println(mult);
		
		IntegerToRoman.intToRoman(mult);
	}

}
