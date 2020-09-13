package collectionFramework.collectionInterface.list;

import java.util.*;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		List<String> vegetables = new LinkedList<>();
//		ArrayList<Integer> fruits = new ArrayList();
//		fruits.add("a");
//		fruits.add(2);
//		System.out.println(fruits);
		
//		Pair<String, Integer> p1 = new Pair("P", 2);
		vegetables.add("Potato");
		
		fruits = null;
		if ( fruits == null) {
			fruits = new ArrayList<>();
			fruits.addAll(vegetables);
			System.out.println(fruits);
		}
//		
//		fruits.add("Apple");
//		fruits.add("PP");
//		vegetables.add("Potato");
//		
//		vegetables.addAll(fruits);
//		
//		System.out.println(vegetables);
//		
//		System.out.println(fruits.get(0));
//		
//		System.out.println(vegetables.get(1));
//		
//		vegetables.set(1, "Param");
//		
//		System.out.println(vegetables);
//		
//		vegetables.remove(1);
//		System.out.println(vegetables);
//		
//		vegetables.removeAll(fruits);
//		System.out.println(vegetables);
//		
//		vegetables.clear();
//		
//		System.out.println(fruits.size());
//		
//		System.out.println(fruits.contains("Apple"));
//		
//		System.out.println(fruits.isEmpty());
//		
////		Object x[] = fruits.toArray();
//		
//		String temp[] = new String[fruits.size()];
//		
//		fruits.toArray(temp);
//		
//		for(String e: temp) {
//			System.out.println(e);
//		}
//		
//		
//		for(String l: fruits) {
//			System.out.print(l + " ");
//		}
//		
//		
//		
//		
//		
//		
//		
//		

	}

}
