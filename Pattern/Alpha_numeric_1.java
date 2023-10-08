package Pattern;

public class Alpha_numeric_1 {

	public static void main(String[] args) {
		int n = 10;
		char a = 'A';
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i==1 || i ==3) {
					System.out.print(" " +a);
					a++;
				}
				else {
					System.out.print(" "+n);
					n--;
				}
			}
			System.out.println(" ");
		}
	}

}
