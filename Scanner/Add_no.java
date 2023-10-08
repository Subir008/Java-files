package Scanner;

import java.util.Scanner;

public class Add_no {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no ");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("Addition is "+c);
	}

}
