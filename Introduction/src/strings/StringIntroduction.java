package strings;

public class StringIntroduction {

	public static void main(String[] args) {

		String name1 = "P f,aksf,rsf,as'f  ,  mgsdg";
		String name2 = "   T a r a m   ', '  / ";
//		String name3 = new String("Param");	
//		
//			System.out.println(name3);
		
		
//		System.out.println(name1.charAt(2));
//		System.out.println(name1.length());
//		System.out.println(name1.substring(2, 4));
//		System.out.println(name1.contains("taran"));
//		System.out.println(name1.equals("Param"));
//		System.out.println(name1.isEmpty());
//		System.out.println(name1.concat("jot"));
//		System.out.println(name1.replace('a', 'b'));
		
		String name4 = name2.trim();
		System.out.println(name4);
		String name[] = name4.split("[^A-Za-z]+");
		System.out.println(name.length);
		for(String name5: name) {
			
			System.out.println(name5.trim());
		}
		
//		System.out.println(name2.indexOf("a"));
//		System.out.println(name2.toLowerCase());
//		System.out.println(name2.trim());
		}

}
