public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        double num=Math.pow(radius,2);
        return 3.14*num;
    }
    
    public double circumference(){
        return 2*3.14*radius;
    }
}
