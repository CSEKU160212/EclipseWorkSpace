package JAVA_Starting_CompleteReference;

import java.lang.reflect.Method;

public class invokePrivateMethod {

	public static void main(String[] args) throws Exception {

		Class c=Class.forName("JAVA_Starting_CompleteReference.test");
		test t=(test)c.newInstance();
		Method m=c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
		
	}

}
