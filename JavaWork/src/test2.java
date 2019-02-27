import java.util.*;

class BookList{
	int id, price;
	String name;

	BookList(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.price;
	}
}

class Sortbyprice implements Comparator<BookList> {
	@Override
	public int compare(BookList b1, BookList b2) {
		return b1.price - b2.price;
	}
}

public  class test2 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		ArrayList<BookList> l = new ArrayList<BookList>();
		BookList b1 = new BookList(101, "Let us C", 300);
		BookList b2 = new BookList(102, "Data_Communication",500);
		BookList b3 = new BookList(103, "Data_Network", 400);
		BookList b4 = new BookList(104, "JAVA", 200);
		BookList b5 = new BookList(105, "Python", 600);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		for (BookList b : l) {
			System.out.println(b.id + "  " + b.name + "  " + b.price);
		}
		
		Collections.sort(l, new Sortbyprice());
		System.out.println("\nSorted by price");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}