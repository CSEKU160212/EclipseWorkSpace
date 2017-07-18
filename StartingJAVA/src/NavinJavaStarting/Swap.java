package NavinJavaStarting;

public class Swap {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+ " b="+b);
		
		a=5;
		b=4;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+ " b="+b);
		
		
		a=5;
		b=4;
		
		a=a^b;  // ^ means XOR... 101 XOR 100 => 001
		b=a^b;  // 001 XOR 100 => 101
		a=a^b;	// 001 XOR 101 =>100
		System.out.println("a="+a+ " b="+b);
		
		
		
		
	}
}
