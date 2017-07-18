
public class Cylinder extends Circle {
    private double height;
    Cylinder(){
        super();
        height=1.0;
    }
    Cylinder(double radius){
        super(radius);
        height=1.0;
    }
    Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    Cylinder(double radius,double height,String color){
        super(radius,color);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    
    public double getVolume(){
        double Volume=super.getArea()*height;
        return Volume;
    }
    public String toString(){
        return "Cylinder: Subclass of Circle "+super.toString()+"height "+height;
    }

}
