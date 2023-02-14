package feb_week3_13_feb_2023.Assignment8;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Employee: 1. Wage Employee, 2. Sales person, 3. Manager ");
        int type = sc.nextInt();
        System.out.println("How many records you want to enter ? ");
        int len = sc.nextInt();
        Employee[] arr = new Employee[len];

        switch (type) {
            case 1:
                for (int i = 0; i < len; i++) {
                    System.out.println("Enter Employee Name, ID, Hourly Rate, and Total Working Hours for Employee " + (i + 1));
                    String name = sc.next();
                    int id = sc.nextInt();
                    int rate = sc.nextInt();
                    int hrs = sc.nextInt();
                    arr[i] = new WageEmployee(name, id, rate, hrs);
                }
                System.out.println("Record entered");
                break;
            case 2:
                for (int i = 0; i < len; i++) {
                    System.out.println("Enter Sales Person Name, ID, Hourly Rate, Total Working Hours, Sales, and Commission for Employee " + (i + 1));
                    String name = sc.next();
                    int id = sc.nextInt();
                    int rate = sc.nextInt();
                    int hrs = sc.nextInt();
                    int sales = sc.nextInt();
                    int commission = sc.nextInt();
                    arr[i] = new SalesPerson(name, id, sales, commission, rate, hrs);
                }
                System.out.println("Record entered");
                break;
            case 3:
                for (int i = 0; i < len; i++) {
                    System.out.println("Enter Manager Name, ID, Fixed Salary, and Incentives for Employee " + (i + 1));
                    String name = sc.next();
                    int id = sc.nextInt();
                    int fixedSalary = sc.nextInt();
                    int incentives = sc.nextInt();
                    arr[i] = new Manager(name, id, fixedSalary, incentives);
                }
                System.out.println("Record entered");
                break;
        }
    }
}
/*====OUTPUT====

Enter the type of Employee: 1. Wage Employee, 2. Sales person, 3. Manager
1
How many records you want to enter ?
1
Enter Employee Name, ID, Hourly Rate, and Total Working Hours for Employee 1
tanmay
5
1000
11
Record entered

* Enter the type of Employee: 1. Wage Employee, 2. Sales person, 3. Manager
2
How many records you want to enter ?
1
Enter Sales Person Name, ID, Hourly Rate, Total Working Hours, Sales, and Commission for Employee 1
sujan
12
100
20
500
100
Record entered

* Enter the type of Employee: 1. Wage Employee, 2. Sales person, 3. Manager
3
How many records you want to enter ?
1
Enter Manager Name, ID, Fixed Salary, and Incentives for Employee 1
pratiksha
23
5000
1000
Record entered
*
Process finished with exit code 0*/

