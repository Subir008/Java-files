package Array;

public class Alphabetical_order {

	public static void main(String[] args) {
		String x = "rocky";
		char arr[] = x.toCharArray();
		
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]);
		}

	}

}
