class Sample
{
	void disp()
	{
		System.out.println("Parent");
	}
}
public class Demo {
	static Sample s = new Sample();
	
	public static void main(String[] arg)
	{
		Demo.s.disp();
	}
}
