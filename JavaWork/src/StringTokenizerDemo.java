import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Hello World", "o");

		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

		System.out.println("---- Split by space ------");
		StringTokenizer st1 = new StringTokenizer("Hello World");
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}

		System.out.println("---- Split by comma ',' ------");
		StringTokenizer st2 = new StringTokenizer("Hello Wo,rld", ",");

		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
	}
}