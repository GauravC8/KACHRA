public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is a" + " platform independent language";
		String s1 = "Hello";
		String s2 = "HELLO";
		String S3 = "hELLO wORLD";
		System.out.println("iNDEX OF t =" + s.indexOf('t'));
		System.out.println("last index of  " + s.lastIndexOf('t'));
		System.out.println("index of(1,10) " + S3.indexOf('L', 5));
		System.out.println(S3.substring(6));
		System.out.println(S3.substring(3, 8));
		System.out.println(s2.concat("WORLD"));
		System.out.println(s2.replace('L', 'l'));
		System.out.println(s2.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}