import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,result;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		try
		{
			result =a/b;
			System.out.println("Result = " + result);
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Exxceptin caught at division by 0");
		}
	}
}
