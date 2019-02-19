import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v =new Vector<String>();
		v.add("Jimmy");
		v.addElement("Rocky");
		v.addElement("Sherra");
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

	}
}
