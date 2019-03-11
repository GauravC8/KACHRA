package Java8;
import java.util.Arrays;
import java.util.List;

public class LamdaDemo4 {

	public static void main(String[] args) {
		//before Java8
		new Thread(new Runnable() {
			@Override
			public void run() { 	System.out.println("Before Java8");	 }
		}).start();
		
		//using Java8
		new Thread(()->System.out.println("Using Java8, Lamda Expression")).start();
		System.out.println("**********************************");
		
		//iteration using Lamda
		List features =Arrays.asList("Lamda","Default Method","Stream API","DATE and TIME API");
		features.forEach(n-> System.out.println(n));
		System.out.println("**********************************");
		
		
		// better way by using of method reference (::)
		features.forEach(System.out::println);

	}

}
