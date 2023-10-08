// Fetch the even & odd number using multithread

package Task;

class Even1 implements Runnable
{
	public void run() 
	{
		for (int i = 1; i <= 10; i++)
		{
			if(i % 2 == 0)
			{
				try {
					System.out.println("Even no " + i);
					Thread.sleep(1800);
				}catch(InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}

class Odd1 implements Runnable
{
	public void run() 
	{
		for (int i = 1; i <= 10; i++)
		{
			if(i % 2 == 1)
			{
				try {
					System.out.println("Odd no " + i);
					Thread.sleep(3000);
				}catch(InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}

public class Task12 {

	public static void main(String[] args) {
		Even1 e1 = new  Even1();
		Thread th1 = new Thread(e1);
		th1.start();
		
		Odd1 o1 = new  Odd1();
		Thread th2 = new Thread(o1);
		th2.start();

	}

}
