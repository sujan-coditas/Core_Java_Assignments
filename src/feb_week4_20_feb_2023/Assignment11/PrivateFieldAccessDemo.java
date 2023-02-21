package feb_week4_20_feb_2023.Assignment11;

import java.lang.reflect.Field;

class Student{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class PrivateFieldAccessDemo {
    public static void main(String[] args) {
        try {
            Student e = new Student("Sujan", 22);
            Field privateField = Student.class.getDeclaredField("name");
            Field privateField1 = Student.class.getDeclaredField("age");

            privateField.setAccessible(true);
            privateField1.setAccessible(true);
            String name = (String)privateField.get(e);
            int age = (int)privateField1.get(e);

            System.out.println("Name of Student:" + name);
            System.out.println("Age of Student:" + age);


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
* Name of Student:Sujan
Age of Student:22

* */

