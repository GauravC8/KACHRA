public class Converse {
	void tobeConvert(final String[] args)
	{
		String binary, hex, octal;
		int num = 100;
		Integer obj = new Integer(num);
		binary = Integer.toBinaryString(num);
		octal = Integer.toOctalString(num);
		hex = Integer.toHexString(num);

		System.out.println("Decimal Value :" + num);
		System.out.println("Binary" + binary);
		System.out.println("Hexadecimal " + hex);
		System.out.println("Octal " + octal);

	}
	public static void main(String[] args)
	{
		Converse c = new Converse();
		c.tobeConvert(args);
	}
}
