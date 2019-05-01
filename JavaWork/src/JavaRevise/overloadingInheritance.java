class Parent
{
	void disp()
	{
		System.out.println("Parent");
	}
}
class Child
{
	void disp(int a)
	{
		System.out.println("Child");
	}
}
public class overloadingInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.disp();
		c.disp(100);
	}
}
