package Java8;

import java.util.function.Predicate;

public class PredicateDemo {

	
	static Boolean checkage(int age)
	{
		if(age>17)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*java.util.function 
boolean value function
methods: test() and() or() isEqual()
takes single value return boolean output
*/
		Predicate<Integer> lesserthan = i->i<18;
		System.out.println(lesserthan.test(10));
		
		
		//using method reference
		Predicate<Integer> p=PredicateDemo::checkage;
		boolean r = p.test(25);
		System.out.println(r);

	}
	

}
