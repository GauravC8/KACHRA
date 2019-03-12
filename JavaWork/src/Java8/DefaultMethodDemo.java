package Java8;

interface TestInterface
{
	public void square(int a);
	
	//default method in interface
	default void show()
	{
		System.out.println("Default method executed");
	}
	//static method in interface
	static void show1()
	{
		System.out.println("Static method executed");
	}
}
public class DefaultMethodDemo implements TestInterface{

	@Override
	public void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		DefaultMethodDemo d = new DefaultMethodDemo();
		d.square(6);
		d.show();
		TestInterface.show1();
	}
}