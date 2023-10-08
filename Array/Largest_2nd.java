package Array;

public class Largest_2nd {

	public static void main(String[] args) {
		int arr [] = {98,85,5,100,65,215,55};
		int firstlargest = 0;
		int secondlargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstlargest)
				{
					secondlargest = firstlargest;
					firstlargest = arr[i]; 
				}
				else if (arr[i] > secondlargest) 
				{
					secondlargest = arr[i];
				}
		}
		System.out.println("First largest : " + firstlargest);
		System.out.println("Second largest : " + secondlargest);

	}

}
