package JAVA_Starting_SunJAVA;

public class DoubleFloat {

	public static void main(String[] args) {
		
		double d = -10.0/0.0;
		double d2 = 10.0/0.0;
		
		float d3 = -10.0f/0.0f;
		float d4 = 10.0f/0.0f;

		if(d == Double.NEGATIVE_INFINITY)
			System.out.println("d just exploded: " +d);
		
	  if(d2 == Double.POSITIVE_INFINITY)
		System.out.println("d2 just exploded: " +d2);
	  
	  if(d3 == Float.NEGATIVE_INFINITY)
			System.out.println("d3 just exploded: " +d3);
		
	  if(d4 == Float.POSITIVE_INFINITY)
		System.out.println("d4 just exploded: " +d4);
	  
	}

}
