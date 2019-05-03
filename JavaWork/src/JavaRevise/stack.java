package JavaWork.src.JavaRevise;

import java.util.Stack;
/*import java.util.*;

class Queue {
    private LinkedList<Integer> list = new LinkedList<Integer>();

    public void enqueue(Integer o) {
        list.addLast(o);
    }

    public Integer front() {
        return list.removeFirst();
    }

    public Integer rear() {
        return list.getLast();
    }

    public Integer dqueue() {
        return list.removeFirst();
    }

    public static void main(String args[]) {

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dqueue());
    }
}
*/
class Car
{
	int price;
	String brand;
	
	public Car(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", brand=" + brand + "]";
	}
	
}
public class stack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Car> list = new Stack<Car>();
		list.push(new Car(1000,"Maruti"));
		list.push(new Car(2000,"BMW"));
		System.out.println(list.pop());
	}

}
