package Array;

public class Linear_add {

	public static void main(String[] args) {
		int arr [] = {1 , 2 ,3 ,4 };
		int sum = 0;
		
		for (int i = 0 ; i <= arr.length-1; i++) {
			sum = sum + arr[i];
			arr [i] = sum ;
			System.out.print(arr[i] +" ");
		}
		
	}

}
