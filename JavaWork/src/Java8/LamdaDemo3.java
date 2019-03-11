package Java8;

import java.util.ArrayList;

public class LamdaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(1);
		arl.add(2);
		arl.add(3);
		arl.add(4);
		arl.forEach(n -> System.out.println(n));
		System.out.print("Even no in arraylist");
		arl.forEach(n -> {
			if (n % 2 == 0)
				System.out.print("\t" + n);
		});
	}
}
