package problemSet11;

public class Triangle extends Shape {
	private double a, b;
	String color;

	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void colorOn() {
		this.color = "Blue";
	}

	public void colorOff() {
		this.color = "White";
	}

	public double getArea() {
		return .5 * (a * b);
	}

	public String toString() {
		return "Triangle [height=" + a + ", width=" + b + "," + color + "]";
	}

}
