public class Triangle extends Shape{
  
public Triangle(double height,double wide)
{
  super(height,wide);
}

public String colorOn()
{
  return "Blue";
}

public double getArea()
{
  return this.h*this.w/2;
}

public String toString()
{
  return "Triangle ["+super.toString()+","+colorOn()+"]";
}
 
}
