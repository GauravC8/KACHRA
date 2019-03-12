package Threading;

class Count extends Thread
{
	Count()
	{
		super("my extending thread");
		System.out.println("My thread created "+this);
		start();
	}
	@Override
	public void run() {
		
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Printing the count " + i);
				Thread.sleep(5000);
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class CountThread 
{
	public static void main(String[] args) {
		Count c = new Count();
		try {
			while (c.isAlive()) {
				System.out.println("Main Thread will be alive till the child thread is live");
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}