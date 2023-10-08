package Practice;

public class String_common_prefix {
	
	

	public static void main(String[] args) {
		String str [] = {"abck", "abcde" , "abcdef"};
	//	String s1 = str[0];
		String res = "";
		String unique = "";
		
		for (int i = 0; i < str.length-1 ; i++) 
		{
			String s2 = str[i];
			String s3 = str[i+1];
			for (int j = 0; j < s2.length()-1; j++)
			{
				for (int k = 0; k < s2.length()-1; k++) 
				{
					if(s2.charAt(j) == s3.charAt(j))
						{
							res  = res+ s2.charAt(i);
						}
				}
			}
		}
		 System.out.println(res);
		
		

	}

}
