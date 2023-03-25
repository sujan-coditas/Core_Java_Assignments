package March_Assignments_2023.week4.Q3_Employee;

import java.util.Scanner;

public class mainMenu {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
EmployeeDetails employeeDetails=new EmployeeDetails();
        boolean flag=true;
        while(flag){
            System.out.println("Enter your choice :");
            System.out.println("0: EXIT ");
            System.out.println("1: add 10 records ");
            System.out.println("2: show all records.");
            System.out.println("3: alter table by adding field city");
            System.out.println("4: fetch only those Employees who are from PUNE and salary>20000 ");
            System.out.println("5: update salary by 1000 of Employees whose experience is more than 3 years ");
            System.out.println("6: delete employee who left organisation");

            int choice=sc.nextInt();

            switch (choice){
                case 0:
                    flag=false;
                    break;

                case 1:
                    employeeDetails.addEmployee();
                    break;
                case 2:
                    employeeDetails.showData();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

                default:
                    System.out.println("Enter valid options ");
                    break;
            }
        }
    }
}
