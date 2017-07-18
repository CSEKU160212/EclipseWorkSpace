package Test;

public class Circle {
private double radius;
 public static int count=0;


public Circle(double radius) {
   this.radius = radius;
   count++;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getRadius() {
   return this.radius;
}
public String toString() {
   return "Circle[radius=" + radius + "]";
}
public double getArea() {
	
	return Math.PI*radius*radius;
}
}