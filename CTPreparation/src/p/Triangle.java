package p;

public class Triangle extends Shape{
private double base, height;

public Triangle(String color, double base, double height)
{
	super(color);
	this.base=base;
	this.height=height;
}


public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getArea()
{
	return .5*base*height;
}

public String toString()
{
	return "Triangle[base="+base+",height="+height+","+super.toString()+"]";
}

}
