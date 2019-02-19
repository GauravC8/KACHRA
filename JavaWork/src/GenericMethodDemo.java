public class GenericMethodDemo {
	public static <E> void printArray(E[] inputArr)
	{
		for(E element : inputArr)
		{
			System.out.printf("%s \t" , element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5,6};
		printArray(intArray);
		Double[] doubleArray = {1.22,2.33,3.44,4.55,5.66,6.77};
		printArray(doubleArray);
		Character[] charArray = {'a','b','c','d','e','f'};
		printArray(charArray);
	}
}