package Array;

public class Rotate_no {

	public static void main(String[] args) {
		int arr [] = { 1 ,2,3,4,5};
		int val = arr[arr.length - 1];
		
		for (int i = arr.length -2 ; i >= 0 ; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = val ;
		
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
