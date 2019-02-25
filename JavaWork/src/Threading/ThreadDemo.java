package Threading;

class MultiThreadingDemo extends Thread
{

	public void run()
	{
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}catch(Exception e)
		{
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	}
}
public class ThreadDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8587807423+9711682132
		
		
		for(int i=0;i<8;i++)
		{
			MultiThreadingDemo mt=new MultiThreadingDemo();
			mt.start();
		}
		System.out.println("This is main thread");
		
	}
}
