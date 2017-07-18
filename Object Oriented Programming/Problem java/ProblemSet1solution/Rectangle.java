public class Rectangle extends Shape{

  public Rectangle(double height,double wide)
  {
    super(height,wide);
  }

  public String colorOff()
  {
  return "White";
  }

  public double getArea()
  {
    return this.h*this.w;
  }

  public String toString()
  {
    return "Rectangle ["+super.toString()+","+colorOff()+"]";
  }


}
