package Pattern;

public class Number_pattern_9 {

	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		for (int i = 0; i < 3; i++)
		{
			
			for (int j = 1; j <= space; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) 
			{
				System.out.print(" "+ j%2);
			}
			System.out.println();
			
			space--;
			star++;
		}
}

}
