// Take 1st number and add all the number that are smaller that one and bigger that one
// then multiply that number 
// Number shouldn't be repeated,

package Task;

public class Task16 {

	
	
	public static void main(String[] args) {
		int [] arr = {8,4,5,3,2,6,9,1};
		
		for (int i = 0; i < arr.length; i++) 
		{
			int sum_greater = 0;
			int sum_lesser = 0;
			int sum_mult = 1;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i] > arr [j])
				{
					sum_greater = sum_greater + arr[j];
				}
				else
				{
					sum_lesser = sum_lesser + arr[j];
				}
				
			}
			sum_mult = sum_greater * sum_lesser;
			System.out.print(" "+sum_mult);
		}
	}
}
