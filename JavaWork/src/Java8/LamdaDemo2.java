package Java8;

public class LamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString reverseStr = str -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println(reverseStr.myStringfun("Lamda String"));
	}

}
