package JAVA_Starting_SunJAVA;

public class MulAndDevideOperator {

	public static void main(String[] args) {
		
		int a=12345, b=23467, c, d;
		long e, f;
		
		c = a*b/b;
		d = a/b*b;
		
		System.out.println(" a is: "+a +"\n b is: "+b+ "\n c is: "+c +"\n d d is: "+d);

		e = (long) a*b/b;
		f = (long)a/b*b;
		
		System.out.println("\n e is: "+e+"\n f is: "+f);
	}

}
