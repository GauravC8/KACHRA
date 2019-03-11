package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// stream
		Stream<Integer> s = Stream.of(1, 2, 3, 4);
		s.forEach(p -> System.out.println(p));

		// collection to stream
		System.out.println("*****************");
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 1; i < 6; i++) {
			l.add(i);
		}

		Stream<Integer> s1 = l.stream(); // stream of list l
		s1.forEach(p -> System.out.println(p));

		// streams to collection : pipelining
		System.out.println("*****************");
		Stream<Integer> s2 = l.stream();
		List<Integer> pl = s2.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(pl);

	}
}
