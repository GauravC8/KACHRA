public class ThrowEx extends Exception {

	private static int accNo[] = { 1001, 1002, 1003, 1004 };
	private static String name[] = { "A", "B", "C", "D", "E" };
	private static double bal[] = { 10000.00, 12000.00, 5600.0, 999.0, 1100.55 };

	ThrowEx(String str) {
		super(str);
	}

	public static void main(String[] args) {

		try {
			System.out.println("Account No:" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
			for (int i = 0; i < 5; i++) {
				System.out.println(accNo[i] + "\t\t" + name[i] + "\t" + bal[i]);
				if (bal[i] < 1000) {
					ThrowEx te = new ThrowEx("Balance is less than 1000");
					throw te;
				}
			}
		} catch (ThrowEx e) {
			e.printStackTrace();
		}
	}
}
