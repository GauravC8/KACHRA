package Mysql;

import java.util.*;

class Book {
	int id, price;
	String name;

	Book(int id, String name, int price) {
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

class Sortbyprice implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return b1.price - b2.price;
	}
}

public  class test2 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		ArrayList<Book> l = new ArrayList<Book>();
		Book b1 = new Book(101, "Let us C", 300);
		Book b2 = new Book(102, "Data_Communication",500);
		Book b3 = new Book(103, "Data_Network", 400);
		Book b4 = new Book(104, "JAVA", 200);
		Book b5 = new Book(105, "Python", 600);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		for (Book b : l) {
			System.out.println(b.id + "  " + b.name + "  " + b.price);
		}
		
		Collections.sort(l, new Sortbyprice());
		System.out.println("\nSorted by price");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}
