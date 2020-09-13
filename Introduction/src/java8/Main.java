package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
		
//		external
//		for(int i = 0; i<6; i++) {
//			System.out.println(l.get(i));
//		}
		
//		external
//		Iterator<Integer> i = l.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		external
//		for(int j : l) {
//			System.out.println(j);
//		}
		
//		internal modified 2
//		l.forEach(i -> System.out.println(i));
		
//		working for internal
//		Consumer<Integer> c = new Consumer<Integer>() {
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
//		
//		l.forEach(c);
		
////		working for internal modified
//		Consumer<Integer> c = (Integer i) -> System.out.println(i); 
//		Consumer<Integer> c = i -> System.out.println(i); 
//		
//		l.forEach(c);
		
//		l.forEach(new Consumer<Integer>() {
//			public void accept(Integer i) {
//				System.out.println(i);
//				}
//		}
//		);
		
//	   	l.forEach(System.out::println); // System.out.println(i); call by value, call by reference, call by method
		
//		l.forEach(i -> doubleit(i));
		l.forEach(Main::doubleit);
		
		
	}
	
	public static void doubleit(int i) {
		System.out.println(i*2);
	}

}
