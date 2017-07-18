public class Shape {
  
  double h,w;
  String c;
  
  public Shape(double height,double wide)
  {
    h = height;
    w = wide;
  }
  
  public String colorOn()
  {
    return "a";
  }
  
  
  public String colorOff()
  {
    return "b";
  }
  
  public double getArea()
  {
    return this.h*this.w;
  }


  
  public String toString()
  {
    return "height="+this.h+", width="+this.w;
  }
  
}
