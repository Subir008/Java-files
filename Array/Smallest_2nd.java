package Array;

import java.util.Arrays;

public class Smallest_2nd {

	public static void main(String[] args) {
		int arr [] = {7,98,10,20,15};
		
		Arrays.sort(arr);
		System.out.println("Smallest : "+ arr[0]);
		System.out.println("Second smallest : " + arr[1]);

	}

}
