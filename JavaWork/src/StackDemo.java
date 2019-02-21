import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	static void showpush(Stack st, int a) {
		st.push(a);
		System.out.println("Push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showpop(Stack st) {
		System.out.println("pop ->");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("Stack: " + st);

	}

	public static void main(String[] args) {
		// LIFO last in first out
		Stack st = new Stack();
		System.out.println("Stack: " + st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 100);
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}

	}

}
