package Exception_Handling;

public class Sample1 {

	public static void main(String[] args) {
	System.out.println("Main start");
		try
	{
		int i = 10/0;
		int [] arr = {2,3,4,5,6};
		System.out.println(arr[i]);
	}catch (ArithmeticException e){
		System.out.println("Handled");
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Solved");
	}
	System.out.println("Main End");
		
	}

}
