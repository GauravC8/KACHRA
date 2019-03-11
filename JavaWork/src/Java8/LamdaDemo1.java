package Java8;

public class LamdaDemo1 {

	public static void main(String[] args) {
		Numerictest isEven = n -> (n % 2 == 0);
		Numerictest isNegative = n -> (n < 0);
		System.out.println(isEven.computeTest(5));
		System.out.println(isNegative.computeTest(-5));
	}
}
