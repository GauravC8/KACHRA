
import java.util.ArrayList;
import java.util.List;

class Book
{
	int id,quantity;
	String name,author,publisher;
	public Book(int id, String name, String author, String publisher,int quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	
	
}
public class ArrayLIstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> l=new ArrayList<Book>();
		Book b1 = new Book(101,"Let us C","Yashwant_Kanetkar","BPB",8);
		Book b2 = new Book(102,"Data_Communication","Forouzan","Mc_Grew_Hill",4);
		l.add(b1);
		l.add(b2);
		for(Book b:l)
		{
			System.out.println(b.id + " " + b.name+ " " +b.author+ " " +b.publisher+ " " +b.quantity);
		}
		
	}

}
