package feb_week3_13_feb_2023.Assignment10;

class Rectangle implements ShapeInterface{
 int length=0;
 int width=0;
 int area;
 Rectangle(int length,int width){
     this.length=length;
     this.width=width;
 }
    @Override
    public double getArea() {
        return area=length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                '}';
    }
}

class Triangle implements ShapeInterface{
    int base=0;
    int height=0;
    double area;
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea() {
        return area= 0.5 * base*height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area +
                '}';
    }
}
public class ShapeOverloading {
    public static void main(String[] args) {

        Rectangle rectangle= new Rectangle(5,20);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.toString());

        Triangle triangle= new Triangle(5,10);
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());


    }
}
/*========OUTPUT==========
* 100.0
Rectangle{area=100}
25.0
Triangle{area=25.0}
*/
