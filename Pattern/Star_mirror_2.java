package Pattern;

public class Star_mirror_2
{
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
			space --;
			star++;
		}
		int star1 = 3;
		int space1 = 1;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j <= space1; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < star1; j++)
			{
				System.out.print("* ");
			}
			
			star1--;
			space1++;
			System.out.println();
		}
	}
}
