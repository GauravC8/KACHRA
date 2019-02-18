public class RuntimeDemo {
	public  static void main(String[] args)
	{
		Runtime ob = Runtime.getRuntime();
		Process obProcess= null;
		try {
			obProcess = ob.exec("calc.exe");
			System.out.println(ob.freeMemory());
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error executing calculator");
			
		}
	}
}
