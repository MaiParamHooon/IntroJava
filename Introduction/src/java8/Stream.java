package java8;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;



public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
		
//		int result = 0;
//		for(int i : l) {
//			result += i; // 6 baar result change ho rha h mtlb mutation arhi h mtlb vo slow kr rha h computer ko
//		}
		
//		System.out.println(l.stream().map(i -> i).reduce(0, (c,e) -> c+e));
		
//		Function<Integer, Integer> f = new Function<Integer, Integer>(){
//
//			@Override
//			public Integer apply(Integer i) {
//				// TODO Auto-generated method stub
//				return i;
//			}
//			
//		};
//		
//		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer i, Integer j) {
//				// TODO Auto-generated method stub
//				return i+j;
//			}
//			
//		};
//		java.util.stream.Stream<Integer> s = l.stream();
//		java.util.stream.Stream<Integer> s1 = s.map(f);
//		Integer result = (Integer)s1.reduce(0, b);
//		System.out.println(result);
		
		
//		System.out.println(l.stream().map(i -> i).reduce(0, (c,e) -> Integer.sum(c, e)));
//		System.out.println(l.stream().map(i -> i).reduce(0, Integer::sum));
		
		
		List<Integer> l = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
//
//		int result = 0; 
//		for(int i : l) {
//			if(i%5==0) {
//				result += i;
//			}
//		}
//		
//		System.out.println(result);
		
//		Predicate<Integer> p = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer i) {
//				// TODO Auto-generated method stub
//				return i%5==0;
//			}
//			
//		};
//		System.out.println(l.stream().filter(p).reduce(0, (c,e) -> c+e));
//		System.out.println(l.stream().filter(i -> i%5==0).reduce(0, (c,e) -> c+e)); //internal iteration
	
		System.out.println(l.stream().filter(i -> i%9==0).findFirst());
		System.out.println(l.stream().filter(i -> i%9==0).findFirst().orElse(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
