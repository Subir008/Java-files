package Task;

public class Task6 {
	public static void main(String[] args) {
		int arr [] = {5,6,1,2,4};
		int sum = 0;
		int div = 1;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		div = sum / 2;
		System.out.println(div);
		
	}

}
