package Pattern;

public class Star_pattern4 {

	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		for (int i = 0; i < 3; i++)
		{
			
			for (int j = 0; j < space; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) 
			{
				System.out.print(" *");
			}
			System.out.println();
			
			space--;
			star++;
		}
		
	}

}
