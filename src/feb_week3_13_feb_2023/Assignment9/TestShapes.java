package feb_week3_13_feb_2023.Assignment9;

abstract class  Shape{
    abstract void area();
}
class Circle extends Shape{
     double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + 3.14 * radius * radius );
    }
}
class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Area of Square: " + (side * side));
    }

}
class Cylinder extends Circle{
     double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    @Override
    void area() {
        System.out.println("Area of Cylinder: " + (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius));
    }
}
class Rectangle extends Square {
    private double length;

    public Rectangle(double side, double length) {
        super(side);
        this.length = length;
    }
    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (side * length));
    }
}
public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Cylinder(5, 10);
        shapes[2] = new Square(5);
        shapes[3] = new Rectangle(5, 10);

        for (Shape shape : shapes) {
            shape.area();
        }

    }
}
/*=============OUTPUT==========
*
Area of Circle: 78.5
Area of Cylinder: 471.23889803846896
Area of Square: 25.0
Area of Rectangle: 50.0
*
* */