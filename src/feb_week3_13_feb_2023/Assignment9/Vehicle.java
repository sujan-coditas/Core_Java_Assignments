package feb_week3_13_feb_2023.Assignment9;


abstract class Vehicle1{
 abstract void engine();
}
class Car extends Vehicle{
    void engine(){
        System.out.println("good engine");
    }
}

class Truck extends Vehicle{
    void engine(){
        System.out.println("truck has bad engine");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Car car=new Car();
        car.engine();
        Truck truck=new Truck();
        truck.engine();


    }
}

/* ============OUTPUT==============
* good engine
truck has bad engine
* */
