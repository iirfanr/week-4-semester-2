package task2;

abstract public class Shape {

    String shapeName;

    abstract double area();

    void toString(String shapeName) {
        System.out.println("The shape is: " + shapeName);
    }
}
