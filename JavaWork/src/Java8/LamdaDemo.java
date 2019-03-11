package Java8;

@FunctionalInterface
interface operation {
	int operate(int a, int b);
}

public class LamdaDemo {

	public static void main(String[] args) {
		operation add = (a, b) -> a + b;
		operation sub = (a, b) -> a - b;
		operation mul = (a, b) -> a * b;
		operation div = (a, b) -> { 
			int c=0;
			try {
				c= a/b;
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			return c;
		};
		System.out.println(add.operate(10, 20));
		System.out.println(sub.operate(50, 30));
		System.out.println(mul.operate(20, 'a'));
		System.out.println(div.operate(20, 2));
	}
}
