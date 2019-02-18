public class RuntimeDemo {
	public  static void main(String[] args)
	{
		Runtime ob = Runtime.getRuntime();
		Process obP= null;
		try {
			obP = ob.exec("calc.exe");
			System.out.println(ob.freeMemory());
			System.out.println(System.getProperty("java.vendor"));
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error executing calculator");
		}
	}
}
