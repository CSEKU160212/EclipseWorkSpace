package JAVA_Starting_SunJAVA;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		
		int a=5, b=12, c=20, s;
		s=a+b;
		System.out.println(a+ " + " +b +" is "+s);
		
		s=a%b;
		System.out.println(a+" % "+b+" is "+s);
		
		s*=c;
		System.out.println(s+" *= "+c+" is "+s);
		
		System.out.println("The value of a before operation is: "+a);
		
		a++;
		System.out.println("The operation a++ is executed");
		System.out.println("Value of a after operation is: "+a);
		
		double d=32.23, e=15.36, f;
		f = d - e;
		
		System.out.println(d+ " - "+e+ " is "+f);
		
		System.out.println(f+" -= 5.60 is");
		
		f -= 5.60;
		
		System.out.println(f);
		
		System.out.println("Value of f before operation is "+f);
		
		f--;
		
		System.out.println("After execution of - operation, the value of f is "+f);
		
		f = d/e;
		
		System.out.println(d+" / "+e+" is "+f);
		
		

	}

}
