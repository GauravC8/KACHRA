package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> names= new ArrayList<>();
	names.add("Amit");
	names.add("Alok");
	names.add("Catty");
	names.add("Danny");
	names.add("Ellen");
	names.add("Naruto");
	names.add("Nagato");
	names.add("Hank");
	names.add("Inno");
	names.add("Inata");
	
	
	//Core stream Operation
	//filter
	
	names.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
	
	System.out.println("*****************");
	//map
	
	names.stream().filter(s->s.startsWith("N")).map(String::toUpperCase).forEach(System.out::println);
	
	System.out.println("*****************");
	//sorted
	
	names.stream().sorted().map(String::toLowerCase).forEach(System.out::println);

	System.out.println("*****************");
	//terminal operation
	//forEach
	names.forEach(System.out::println);
	
	System.out.println("*****************");
	//collect
	List<String> namesUppercase = names.stream().sorted().
			map(String :: toUpperCase).collect(Collectors.toList());
	System.out.println(namesUppercase);
	
	System.out.println("*****************");
	//count
	long tm =names.stream().filter(s->s.startsWith("I")).count();
	System.out.println("Names count starts with I  = " + tm);
	
	System.out.println("*****************");
	//reduce
	Optional<String> r=names.stream().reduce((s1,s2)->s1 + "#" +s2);
	r.ifPresent(System.out::println);
	
	}

}
