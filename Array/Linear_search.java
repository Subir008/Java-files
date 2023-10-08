package Array;

public class Linear_search {

	public static void main(String[] args) {
		int arr [] = {1,3,5,7,8,9,2,4,6};
		int find = 4;
		
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == find) {
				System.out.println("Element is found " + i);
			}
		}
	}

}
