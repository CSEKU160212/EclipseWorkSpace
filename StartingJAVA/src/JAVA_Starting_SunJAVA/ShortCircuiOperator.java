package JAVA_Starting_SunJAVA;

public class ShortCircuiOperator {

	public static void main(String[] args)
	{
		int q = 30;
		int m = 45;
		
		if(m == 40 && q++ == 30)
		{}
		
		System.out.println("Reason is shortcircuit "+q);
		
		q=30;
		if(m == 40 & q ++ == 30)
		{}
		
		System.out.println("reason is normal operation "+q);
	}
}
