public class Circle {
    public double radius;
    public String color;
    
    Circle(){
        radius=1.0;
        color="Red";
    }
    Circle(double radius){
        this.radius=radius;
        color="Red";
    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        double Area=Math.PI*radius*radius;
        return Area;
    }
    public String toString(){
        return " [ Radius= "+getRadius()+" color= "+getColor()+" ] "; 
    }
}
