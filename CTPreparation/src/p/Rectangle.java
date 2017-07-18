package p;

public class Rectangle extends Shape{
private double length, weidth;
public Rectangle(String color, double length, double weidth)
{
	super(color);
	this.length=length;
	this.weidth=weidth;
}

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWeidth() {
	return weidth;
}
public void setWeidth(double weidth) {
	this.weidth = weidth;
}

public double getArea()
{
	return length*weidth;
}

public String toString()
{
	return "Rectangle[length"+length+",width="+weidth+","+super.toString()+"]";
	}

}
