package p;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Rectangle("red", 4, 5);
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());
		ShapeList sList = new ShapeList();
		Shape s2 = new Triangle("blue", 4, 5);
		sList.AddShape(s1);
		sList.AddShape(s2);
		System.out.println(sList);
		System.out.println("Area is " + s2.getArea());

	}
}
/*
Rectangle[length=4,width=5,Shape[color=red]]
Area is 20.0
Rectangle[length=4,width=5,Shape[color=red]]
Triangle[base=4,height=5,Shape[color=blue]]

Area is 10.0
*/
