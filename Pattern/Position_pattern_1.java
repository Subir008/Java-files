package Pattern;

public class Position_pattern_1 {


	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i==1 || i==2 && j==3 || i==3 && j==3 || i==4 && j==3) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
