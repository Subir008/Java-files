package Pattern;

public class Number_pattern_5 {

	public static void main(String[] args) {
		int n = 4;
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
