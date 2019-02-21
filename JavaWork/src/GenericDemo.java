import java.util.Scanner;

class Pair<T> {
	private T first;
	private T second;

	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}

	/*
	 * public T getFirst() { return first; } public void setFirst(T first) {
	 * this.first = first; } public T getSecond() { return second; } public void
	 * setSecond(T second) { this.second = second; }
	 */
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

	@Override
	public boolean equals(Object oob) {
		if (oob == null)
			return false;
		else if (getClass() != oob.getClass())
			return false;
		else {
			Pair<T> opair = (Pair<T>) oob;
			return (first.equals(opair.first) && second.equals(opair.second));
		}
	}

}

public class GenericDemo {

	public static void main(String[] args) {
		Pair<String> p1 = new Pair("Happy", "Day");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two words");
		String s1 = s.next();
		String s2 = s.next();
		Pair<String> inputPair = new Pair(s1, s2);
		if (inputPair.equals(p1)) {
			System.out.println("You type the correct pairs in correct order");
		} else {
			System.out.println("you guess incorrectly");
			System.out.println("Your guess " + inputPair + "  but the correct words are " + p1);
		}

		Pair<Float> p2 = new Pair(1.0f, 2.2f);
		System.out.println("Enter the two words");
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		Pair<Float> inputPair2 = new Pair(i1, i2);
		if (inputPair2.equals(p2)) {
			System.out.println("You type the correct pairs in correct order");
		} else {
			System.out.println("you guess incorrectly");
			System.out.println("Your guess " + inputPair2 + "  but the correct words are " + p2);
		}
	}
}
