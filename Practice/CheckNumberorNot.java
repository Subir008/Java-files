package Practice;

import java.util.Scanner;

public class CheckNumberorNot {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Eter the number");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        if(n>=-100 && n<=100)
        {
        	for (int i = 0; i < s.length(); i++) {
        		
		         if (Character.isDigit(s.charAt(i)) && i==s.length()-1)
		        {
		        	  System.out.println("Good job");
		        }
		       
        	}
        }
	        else {
	            System.out.println("Wrong answer");
	        }
    }
}
