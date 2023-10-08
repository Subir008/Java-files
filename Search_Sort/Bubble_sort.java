package Search_Sort;

public class Bubble_sort {

	public static void main(String[] args) 
	{
		int arr [] =  {85,5,40,6,22,30};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length-1-i; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
