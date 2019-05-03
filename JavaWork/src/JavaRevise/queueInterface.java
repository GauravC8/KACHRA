package JavaWork.src.JavaRevise;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq = new PriorityQueue<String>();
		pq.add("AA");
		pq.add("BB");
		pq.add("CC");
		System.out.println(pq.poll());
		pq.forEach(q->System.out.println(q));
	}

}
