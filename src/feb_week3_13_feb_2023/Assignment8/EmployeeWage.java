package feb_week3_13_feb_2023.Assignment8;

import java.util.Scanner;
class Employee {
    private String name;
    private int id;
    public Employee() {}

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

class WageEmployee extends Employee {
    private int hrs;
    private int rate;

    public WageEmployee(String name, int id, int hrs, int rate) {
        super(name, id);
        this.hrs = hrs;
        this.rate = rate;
    }

    public int computeSalary() {
        return hrs * rate;
    }

    public String toString() {
        return super.toString() + ", Hours: " + hrs + ", Rate: " + rate + ", Salary: " + computeSalary();
    }
}

class SalesPerson extends WageEmployee {
    private int sales;
    private int commission;

    public SalesPerson(String name, int id, int hrs, int rate, int sales, int commission) {
        super(name, id, hrs, rate);
        this.sales = sales;
        this.commission = commission;
    }

    public int computeSalary() {
        return super.computeSalary() + sales * commission;
    }

    public String toString() {
        return super.toString() + ", Sales: " + sales + ", Commission: " + commission;
    }
}

class Manager extends Employee {
     int fixedSalary;
     int incentives;

    public Manager(String name, int id, int fixedSalary, int incentives) {
        super(name, id);
        this.fixedSalary = fixedSalary;
        this.incentives = incentives;
    }

    public int computeSalary() {
        return fixedSalary + incentives;
    }

    public String toString() {
        return super.toString() + ", Fixed Salary: " + fixedSalary + ", Incentives: " + incentives + ", Salary: " + computeSalary();
    }
}

public class EmployeeWage {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter   Employe Name,Employee id ,hourlyRate and totalWorkingHours : ");
        String name=sc.next();
        int id=sc.nextInt();
        int hrs=sc.nextInt();
        int rate=sc.nextInt();
        WageEmployee wageEmployee=new WageEmployee(name,id,hrs,rate);
        wageEmployee.computeSalary();
        System.out.println("  Salary of Employee is: " + wageEmployee.computeSalary());

        System.out.println("Enter  Sale's person Name , id , hourlyRate and totalWorkingHours , Sales , Commission ");
        String salesPersonName=sc.next();
        int sid=sc.nextInt();
        int shrs=sc.nextInt();
        int srate=sc.nextInt();
        int sales= sc.nextInt();
        int commission=sc.nextInt();

        SalesPerson salesPerson=new SalesPerson(salesPersonName,sid,shrs,srate,sales,commission);
        System.out.println("  Salary of Sales Person is: " +   salesPerson.computeSalary());



        System.out.println("Enter  Manager's Name, id , fixed Salary , incentives ");
        String managerName=sc.next();
        int mid=sc.nextInt();
        int fixedSalary=sc.nextInt();
        int incentives=sc.nextInt();
        Manager manager=new Manager(managerName,mid,fixedSalary,incentives);
        System.out.println("  Salary of Manager is: " +   manager.computeSalary());




    }
}
/*============OUTPUT==============
* Enter   Employe Name,Employee id ,hourlyRate and totalWorkingHours :
sujan
12
100
15
  Salary of Employee is: 1500
Enter  Sale's person Name , id , hourlyRate and totalWorkingHours , Sales , Commission
pratiksha
23
200
10
23
150
  Salary of Sales Person is: 5450
Enter  Manager's Name, id , fixed Salary , incentives
Tanmay
21
20000
1500
  Salary of Manager is: 21500
*/
