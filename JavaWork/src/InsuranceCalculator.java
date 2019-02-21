class InsuranceRate {
	protected InsuranceRate() {
	}

	public int calculateRate(final String birth) throws Exception {
		final int year = 2015;
		int age = 0;
		int birthYear = Integer.parseInt(birth);
		age = year - birthYear;
		if (age < 16) {
			System.out.println("Age is:" + age);
			throw new Exception();
		} else {
			int drivenYears = age - 16;
			if (drivenYears < 4) {
				return 1000;
			} else {
				return 600;
			}
		}
	}
}

class InsuranceCalculator {
	public static void main(String[] args) {
		InsuranceRate obj = new InsuranceRate();
		String inData = "1997";
		try {
			System.out.println("your insurance is : " + obj.calculateRate(inData));
		} catch (Exception oops) {
			System.out.println("too young for insurance");
		}
	}
}