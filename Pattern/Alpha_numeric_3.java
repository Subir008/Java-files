package Pattern;

public class Alpha_numeric_3 {

	public static void main(String[] args) {
	
		int no = 1;
		char ch = 'A';
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j==1 || j==3) {
					System.out.print(" " +ch);
					ch+=5;
				}else {
					System.out.print(" " +no);
					no+=5;
				}
			}
			ch-=9;
			no-=9;
			System.out.println();
		}

	}

}
