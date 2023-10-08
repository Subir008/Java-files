package Practice;

// Arrange from last to first .

public class Arrange_alpha {

	public static void main(String[] args) {
		String x = "hello mc";
		char y [] = x.toCharArray();
		
		for (int i = 0; i <= y.length-1; i++) {
			for (int j = 0; j < y.length-1; j++) {
				if(y[j] < y[j+1]) {
					char temp = y[j];
					y[j] = y[j+1];
					y[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i <= y.length-1; i++) {
			System.out.print(y[i]);
			
		}

	}

}
