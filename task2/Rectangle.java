package task2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super.toString("Rectangle");
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
    
}
