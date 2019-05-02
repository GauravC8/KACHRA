class Parent
{
/* 	Parent()
	{
		System.out.println("parent");
	}
	Parent(int a)
	{
		System.out.println("parent a"+ a);
	} */
	static void display()
	{
		System.out.println("parent display");
	}
}
class Child extends Parent
{
/* 	Child()
	{
		super(20);
		System.out.println("child");
	}
	Child(int a)
	{
		System.out.println("child a"+ a);
	} */
	void display()
	{
		System.out.println("child display");
	}
}
class Inheritance
{
	public static void main(String[] arg)
	{
		Child c = new Child();
		c.display(100);
	}
}