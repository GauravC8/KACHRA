
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b= new StringBuffer("JAVA");
		b.append(" Guide Ver1.");
		b.append(2);
		int index = 5;
		b.insert(index," Student ");
		index=23;
		b.setCharAt(index,'.');
		int start =24;
		int end = 25;
		b.replace(start, end, "S");
		String s=b.toString();
		System.out.println(s);
	}

}
