//diamond pattern
class pattern {
	public static void main(String[] agrs) {
		int j, i;
		for (j = 0; j <= 10; j++) {
			for (i = 0; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (j = 0; j <= 10; j++) {
			for (i = 10; i > j; i--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}