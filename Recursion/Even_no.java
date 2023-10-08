package Recursion;

public class Even_no {
	
	static void even(int no)
	{
		if(no <= 10) {
			if (no % 2 == 0)
			{
				System.out.println(no);
			}
			no++;
			even(no);
		}
		
	}

	public static void main(String[] args) {
		even(1);
	}

}
