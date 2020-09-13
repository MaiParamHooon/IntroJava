package collectionFramework.collectionInterface.list;

import java.util.*;


public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MakeLL<Integer> ll = new MakeLL<>();
//			List<Integer> ll = new LinkedList<>();
//			List<Integer> al = new ArrayList<>();
			ll.add(12);
			ll.add(44);
//			System.out.println(ll);
//			
//			System.out.println(ll.get(1));
//			getTimeDiff(al);
//			getTimeDiff(ll);
//			ll.print();
			}
	
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		for(int i = 0;  i < 1000; i++) {
			
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " " + (end - start));
		
		
	}
	
	

}
