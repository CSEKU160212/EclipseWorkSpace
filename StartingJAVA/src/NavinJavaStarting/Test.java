package NavinJavaStarting;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class class1=Class.forName("NavinJavaStarting.Show");
		Show aTest=(Show)class1.newInstance();
		aTest.Show(); 
	}
}
