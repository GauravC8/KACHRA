import java.util.Scanner;
class readKey
{
	public static void main(String[] args)
	{
		char[] c=new char[10];
		int i=0;
		Scanner s = new Scanner(System.in);
		do {
			c[i] = s.next().charAt(0);
			i++;
		}while(c[i]!='#');
		
	}
}