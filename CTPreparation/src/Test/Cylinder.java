package Test;

public class Cylinder extends Circle {
private double height;
public static int count2=0;

public Cylinder(double height, double radius) {
   super(radius);
   this.height = height;
   count2++;
   count--;
}


public void setHeight(double height) {
	this.height = height;
}

public double getHeight() {
   return this.height;
}

public String toString() {
   return "Cylinder[height=" + height + "," + super.toString() + "]";
}

public double getArea()
{
	return 2*Math.PI*getRadius()*height;
	}

public double getVolume() {
		return super.getArea()*height;
}

}
