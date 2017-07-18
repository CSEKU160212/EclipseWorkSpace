package problemSet11;

public class Rectangle extends Shape {

	private double x, y;
	private String color;

	public Rectangle(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void colorOn() {
		this.color = "Blue";
	}

	public void colorOff() {
		this.color = "White";
	}

	public double getArea() {
		return x * y;
	}

	public String toString() {
		return "Rectangular [height=" + x + ", width=" + y + "," + color + "]";
	}

}
