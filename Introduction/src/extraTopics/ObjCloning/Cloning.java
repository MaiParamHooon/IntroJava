package extraTopics.ObjCloning;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.i = 1;
		obj.j = 5;
		
//		A obj1 = obj;
		
//		A obj1 = new A();
//		obj1.i = 5;
//		obj1.j = 6;
		
		A obj1 = (A) obj.clone();
		System.out.println(obj1);
	}

}

class A implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
