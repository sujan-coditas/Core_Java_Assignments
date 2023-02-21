package feb_week4_20_feb_2023.Assignment12;

class Employee{
    int id = 0;
    String name = " ";
    String address = " ";
    int salary = 00;

    public Employee(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Q9_ConstructorExample {
    public static void main(String[] args) {
        Employee employee = new Employee(1211,"Sujan Shaikh","Nanded",55000);
        System.out.println(employee);
    }
}
/*============OUTPUT============
* Employee{id=1211, name='Sujan Shaikh', address='Nanded', salary=55000}
* */
