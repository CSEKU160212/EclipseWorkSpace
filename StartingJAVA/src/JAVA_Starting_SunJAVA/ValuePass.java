package JAVA_Starting_SunJAVA;

public class ValuePass {
	
	public static void main(String [] args)
	{
		System.out.println(getHello("Limon"+ ""));
	}
	
	public static String getHello(String name)
	{
		String hello = "Hi, " + name + "!, How are you?????";
		return hello;
	}

}
