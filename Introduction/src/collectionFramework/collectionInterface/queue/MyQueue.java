package collectionFramework.collectionInterface.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakeQueue<Integer> q = new MakeQueue<>();
		
//		q.add(12);
//		q.add(34);
//		q.add(45);
//		
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.element());
		
//		q.remove();
//		System.out.println(q.poll());
		
		q.enqueue(5);
		q.enqueue(6);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
	}

}
