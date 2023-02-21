package feb_week4_20_feb_2023.Assignment11;

import java.lang.reflect.Method;

class Flower {
    private String name;
    private String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private void displayFlower(String name, String color) {
        System.out.println("Name of Flower is: " + name + " color of flower is: " + color);
    }
}


public class ParametrizedMethodExapmle {
    public static void main(String[] args) throws NoSuchMethodException {
        Flower flower=new Flower("Rose","Red");
        Class Flower=void.class;
        Method[] methods = flower.getClass().getDeclaredMethods();
        for (Method method : methods)
            System.out.println(method.getName());

    }
}

/*
* displayFlower
* */