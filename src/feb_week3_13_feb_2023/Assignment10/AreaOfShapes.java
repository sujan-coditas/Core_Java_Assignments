package feb_week3_13_feb_2023.Assignment10;
class Shape {
    public double calculateArea(String shape, Double... n) {

        switch (shape) {
            case "circle":
                double radius = n[0];
                return 3.14 * radius * radius;

            case "rectangle":
                double length = n[0];
                double width = n[1];
                return length * width;

            case "triangle":
                double base = n[0];
                double height = n[1];
                return 0.5 * base * height;

            default:
                return 0;

        }

    }
}


public class AreaOfShapes {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println("Area of Circle : " + shape.calculateArea("circle",4.5));
        System.out.println("Area of Rectangle : " + shape.calculateArea("rectangle",5.5,10.0));
        System.out.println("Area of Triangle : " + shape.calculateArea("triangle",4.5,7.9));

    }
}

