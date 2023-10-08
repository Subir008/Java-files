package Practice;
import java.util.Scanner;


//
//public class Substring {
//
//	public static void main(String[] args) {
//		String s1 = "sys";
//		String copy = s1;
//		String s2="";
//			
//		for(int i = s1.length()-1; i >=0 ;i--) 
//		{
//			s2 = s2 + s1.charAt(i);
//		}
//		if(copy.equals(s2))
//		{
//			System.out.println("pallindrome");
//		}else {
//			System.out.println("not");
//		}
//		System.out.println(s2);
//	}
//}


public class Substring {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String copy =  A;
        String s1 = "";
        for(int i=s1.length()-1; i>=0; i--)
        {
            s1 = s1 + A.charAt(i);
        }
        System.out.println(s1);
        if(copy.equals(s1))
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}