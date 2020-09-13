package extraTopics.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class c = Class.forName("extraTopics.reflection.Test");
		Test t = (Test)c.newInstance();
		
		Method m = c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
		
	}
	
}
