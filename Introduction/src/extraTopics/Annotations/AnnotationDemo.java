package extraTopics.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new B();
//		b.showMyDataFromLastYearDB();
//		b.show();
//		b.ab();
//		
		
		NokiaSeries obj = new NokiaSeries("Fire", 5);
		
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
	String os() default "Symbian";
	int version() default 1;
}

@SmartPhone(os="Android", version = 6)
class NokiaSeries{
	String model;
	int size;
	
	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
}

//class A {
//		public void showMyDataFromLastYearDB() {
//			System.out.println("in a");
//		}
//		
//		public void ab() {
//			
//		}
//	}
//
//class B extends A{
//	@Override
//	public void showMyDataFromLastYearDB() {
//		System.out.println("in b");
//	}
//	@Deprecated
//	public void show() {
//		
//	}
//}
