package Task;

//  Add all the integer value from the string....

public class Task2 {

	static int sum;
	static void add(char ch)
	{
		int result = Character.getNumericValue(ch);
		sum = sum + result;
	}
	
	public static void main(String[] args) {
		
		String s1 = "999Ma123va234";
//		int sum = 0;
		
//		for (int i = 0; i < s1.length(); i++) 
//		{
//			if (Character.isDigit(s1.charAt(i))) 
//			{
//				sum = sum + s1.charAt(i) - '0';
//			}
//		}
//		System.out.println(sum);

		
		
//		for (int i = 0; i < s1.length(); i++)
//		{
//			if(Character.isDigit(s1.charAt(i)))
//			{
//				int result = Character.getNumericValue(s1.charAt(i));
//				sum = sum + result;
//			}
//		}
//		System.out.println(sum);
		
		
		for (int i = 0; i < s1.length(); i++) 
		{
			if (Character.isDigit(s1.charAt(i)))
			{
				char ch = s1.charAt(i);
				add(ch);
			}
		}
		System.out.println(sum);
						
		
	}

}
