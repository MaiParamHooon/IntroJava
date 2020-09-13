package collectionFramework.collectionInterface.deque;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		
//		ad.addFirst(12);
//		ad.poll();
		
//		MyDeque<Integer> ad = new MyDeque<>();
//		ad.addToHead(2);
//		System.out.println(ad.removeList());
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("kiwi");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banna");
		
		System.out.println(pq); 
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
	}

}
