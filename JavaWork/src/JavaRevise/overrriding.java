class Parent
{
	Parent()
	{
		System.out.println("parent");
	}
	Parent(int a)
	{
		System.out.println("parent a"+a);
	}
}
class Child extends Parent
{
	Child()
	{
		super(20);
		System.out.println("child");
	}
	Child(int a)
	{
		System.out.println("child a"+a);
	}
}
class Inheritance
{
	public static void main(String[] arg)
	{
		Child c = new Child();
		Child c1 = new Child(10);
	}
}