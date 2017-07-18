public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
         System.out.println(c1);
         
         c1.setRadius(5);
         c1.setColor("Green");
         c1.setHeight(10);
         
         System.out.println("New Values \n"+c1);
         System.out.println("Base Area is "+c1.getArea());
         System.out.println("Volume= "+c1.getVolume());
         
    }
    
}