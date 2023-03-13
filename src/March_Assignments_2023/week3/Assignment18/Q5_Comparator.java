package March_Assignments_2023.week3.Assignment18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public float getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return (int) (this.salary - o.salary);
    }
}

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Q5_Comparator {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(01, "Sujan", 5000));
        list.add(new Employee(04, "Raju", 45000));
        list.add(new Employee(02, "Sajan", 20000));
        list.add(new Employee(03, "Ram", 25000));

        System.out.println("Sorted by name : ");
        Collections.sort(list, new SortByName());
        for (Employee e : list) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Salary > 15000");
        Collections.sort(list);
        for (Employee e : list) {
            if (e.salary > 15000)
                System.out.println(e);
        }
        System.out.println();
    }
}
/*
Sorted by name :
Employee{id=4, name='Raju', salary=45000.0}
Employee{id=3, name='Ram', salary=25000.0}
Employee{id=2, name='Sajan', salary=20000.0}
Employee{id=1, name='Sujan', salary=5000.0}

Salary > 15000
Employee{id=2, name='Sajan', salary=20000.0}
Employee{id=3, name='Ram', salary=25000.0}
Employee{id=4, name='Raju', salary=45000.0}


Process finished with exit code 0
* */