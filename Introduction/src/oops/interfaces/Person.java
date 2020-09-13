package oops.interfaces;

public  class Person implements Youtuber, Student {

	public static void main(String[] args) {
//		Person obj = new Person();
//		obj.study();
		// TODO Auto-generated method stub
		
//		Student param = new Student(); (yeh object student ka isliye error dikha rha becoz interface meh not allowed)
//		Student param; (yeh object person ka h isliye yeh allowed h)

	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Studying");
		
	}

	@Override
	public void makeVideo() {
//		// TODO Auto-generated method stub
		System.out.println("making videos");
		
	}

	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		
	}


}
	
	 


