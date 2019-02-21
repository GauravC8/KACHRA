
public class ExceptionMulCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		int arr[] = new int[6];

		try {
			for (int i = 0; i < 6; i++) {
				arr[i] = i;
			}
			result = num1 / num2;
			System.out.println("Result of Division " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	}

}
