class Student
{
	private int age;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
class Hiding {

	public static void main(String[] args) {
		Student c = new Student();
		//c.age=10; show error.
		c.setAge(21);
		System.out.println(c.getAge());
		
	}
}
