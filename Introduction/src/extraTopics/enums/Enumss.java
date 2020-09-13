package extraTopics.enums;

public class Enumss {
	
	enum Mobile{
		
		APPLE(100),SAMSUNG(10),HTC(19);
//		APPLE();
		
		Mobile(int p){
			System.out.println("Price " + p);
		}
		
		 void param(){
			System.out.println("p");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Mobile.APPLE);
//		Mobile.APPLE.param();
		
//		System.out.println(Mobile.APPLE.ordinal());  yeh tujhe index de rha h 
		
		Mobile m[] = Mobile.values();
		for(Mobile k: m) {
			System.out.println(k);
		}

	}

}
