package Pattern;

public class Alpha_numeric_2 {

	public static void main(String[] args) {
		int n = 10;
		char ch = 'A';
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i==1 || i==3) {
					System.out.print(" " +ch);
					ch++;
				} else {
					System.out.print(" " +n);
					n--;
				}
			}
			System.out.println();
		}

	}

}
