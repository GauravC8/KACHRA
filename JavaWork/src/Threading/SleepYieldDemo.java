package Threading;
public class SleepYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " is sleeping for 3 sec");
		try {
			Thread.currentThread();
			Thread.sleep(300);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("Main thread had enough sleep ");
		System.out.println("Yield example starts");
		
		Thread producer = new Producer();
		Thread consumer = new Consumer();
		producer.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);

		producer.start();
		consumer.start();
	}

}
class Producer extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("I am Producer : Producing Item "+i);
			Thread.yield();
		}
	}
}
class Consumer extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("I am Consumer : Consuming Item "+i);
			Thread.yield();
		}
	}
}