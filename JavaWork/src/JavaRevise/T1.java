import java.util.Scanner;
public class T1 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		byte m1,m2,m3;
		System.out.println("First Subject MArks");
		m1 = s.nextByte();
		System.out.println("Second Subject MArks");
		m2 = s.nextByte();
		System.out.println("First Subject MArks");
		m3 = s.nextByte();
		
		//short total = (short)(m1+m2+m3);
		int total = m1+m2+m3;
		float percentage = (float)total/3;
		
		System.out.println("Total : " + total);
		System.out.println("Percentage : " + percentage);
		
		
	}
}