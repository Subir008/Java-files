package Array;

import java.util.Scanner;

public class Rotate {
	
	static void rotation(int a) {
		
		int arr [] = {1,2,3,4,5};
		for (int i=0; i < a ; i++)
		{
			int temp=0;
			for(int j =0; j < arr.length-1; j++)
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		for(int i=0; i < arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rotation times ");
		int x = sc.nextInt();
		rotation(x );
		
		
		

	}

}
