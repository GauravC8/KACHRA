class Parent
{
	static void disp()
	{
		System.out.println("Parent");
	}
	static void disp(int a)
	{
		System.out.println("Child");
	}
}
public class overloadingInheritance {

	public static void main(String[] args) {
		Parent c = new Parent();
		c.disp(100);
	}
}
