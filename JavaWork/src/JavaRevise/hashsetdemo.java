package JavaWork.src.JavaRevise;

import java.util.SortedSet;
import java.util.TreeSet;

public class hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Number> s = new TreeSet<Number>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		System.out.println(s);
		System.out.println(s.headSet(30));
		System.out.println(s.tailSet(30));		
		System.out.println(s.subSet(20, 50));
	}
}
