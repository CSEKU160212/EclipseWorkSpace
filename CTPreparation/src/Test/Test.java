package Test;

public class Test {

	public static void main(String[] args) {
		
		Circle c1=new Cylinder (4.2, 1.5);
		Circle c2=new Cylinder(7.8, 5.3);
		Circle c3=new Circle(7.8);
		Circle c4=new Circle(9);
		Cylinder c5=new Cylinder(6.5, 3.2);
		
		List l=new List();
		l.addList(c4);
		l.addList(c2);
		l.addList(c1);
		l.addList(c3);
		l.addList(c5);
		
		System.out.println("There are "+Circle.count+" Circle");
		System.out.println(l);
		System.out.println("There are "+Cylinder.count2+" Cylinder\n");
		
		System.out.printf("Area of c1: %.2f\n",c1.getArea());
		System.out.printf("Area of c2: %.2f\n",c2.getArea());
		System.out.printf("Volume of c5: %.2f\n",c5.getVolume());
		

	}

}
