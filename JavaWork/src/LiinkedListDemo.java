import java.util.LinkedList;

public class LiinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println("Linked list Content" + ll);
		ll.addFirst("First Item");
		ll.addLast("Last Item");
		System.out.println("LinkedList after operation" + ll);

		Object var1 = ll.get(0);
		System.out.println("First Element" + var1);
		ll.set(0, "Changed Item");

		Object var2 = ll.get(0);
		System.out.println("First Element after update " + var1);

		ll.removeFirst();
		ll.removeLast();
		System.out.println("LinkedList after deletion of first and last element " + ll);

		ll.add(0, "Newly added item");
		ll.remove(2);
		System.out.println("Final Content of linked list" + ll);
	}
}