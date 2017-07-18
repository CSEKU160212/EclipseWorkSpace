public class TestShape {
  
  
  public static void main(String[] args) { 
  
    Shape shape,shape2;
    shape=new Triangle(10, 5);
    shape.colorOn();
    System.out.println(shape);
    System.out.println("Triangle Area is "+shape.getArea());
    shape2=new Rectangle(20, 10);
    shape2.colorOff();
    System.out.println(shape2);
    System.out.println("Rectangle Area is "+shape2.getArea());
  
  }
  
  
  
}
