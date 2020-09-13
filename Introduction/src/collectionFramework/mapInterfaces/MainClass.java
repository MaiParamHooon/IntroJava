package collectionFramework.mapInterfaces;

import java.util.*;
import java.util.Map.Entry;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<>();
		
//		m.put("null",1);
//		m.put("two", 2);
//		
//		m.putIfAbsent("two",3);
//		
//		m.remove("two",3);
//		System.out.println(m.get("three"));
//		System.out.println(m.containsKey("null"));
//		System.out.println(m.containsValue(3));
//		System.out.println(m.keySet());
//		System.out.println(m.values());
//		System.out.println(m.entrySet());
//		System.out.println(m);
//		
//		Set<Entry<String, Integer>> entries = m.entrySet();
//		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue()*100);
//		}
//		System.out.println(m);

	System.out.println(getHash("CAT"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i<s.length(); i++) {
			hash+= s.charAt(i);
		}
		return hash;
	}

}
