import java.util

		.ArrayList;
import java.util.List;

class Playerlist {
	ArrayList<Object> playerArray;
	List<Object> sublistobj;

	public Playerlist() {
		playerArray = new ArrayList<>();
		sublistobj = new ArrayList<>();
	}

	void add() {
		for (int i = 0; i < 5; i++) {
			playerArray.add(new Integer(i));
		}
		playerArray.add("Martine");
		playerArray.add("Serena");
		playerArray.add("Venus");
		playerArray.add("MArk");
		System.out.println();
	}

	void search() {
		System.out.println();
		System.out.println("************************************************");
		System.out.println("Search for object return first and last position");
		System.out.println("************************************************");
		System.out.println();
		System.out.println("First occurance of string" + " \"Serena\" is at position-" + playerArray.indexOf("Serena"));
		System.out.println(
				"Last occurance of string" + " \"Serena\" is at position-" + playerArray.lastIndexOf("Serena"));
	}

	void display() {
		System.out.println("Retrive object from arraylist");
		System.out.println("************************************************");
		for (int i = 0; i < playerArray.size(); i++) {
			System.out.print("\t" + playerArray.get(i));
		}
		System.out.println();
	}

	void extract() {
		System.out.println("extracting the sublist");
		System.out.println("************************************************");
		sublistobj = playerArray.subList(5, playerArray.size());
		System.out.println(sublistobj);
		System.out.println();
	}
}

public class ArraylistDemo {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Playerlist pl = new Playerlist();
		pl.add();
		pl.search();
		pl.display();
		pl.extract();
	}
}
