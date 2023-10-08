package Task;

import java.util.Arrays;

// Sorting a array then fetching unique one and sum them...

public class Task1 {

	public static void main(String[] args) {
		
		int arr [] = { 5,1,2,4,2,3};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count ++;
				}
				
			}
				if (count == 1)
			{
				sum = sum + arr[i];
				
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
