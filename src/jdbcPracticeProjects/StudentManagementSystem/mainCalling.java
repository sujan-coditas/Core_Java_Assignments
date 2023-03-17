package jdbcPracticeProjects.StudentManagementSystem;

import java.util.Scanner;

public class mainCalling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        AddStudent addStudent=new AddStudent();

        boolean Exit=false;
        while(!Exit){
            System.out.println("Enter Details :");
            System.out.println("1: Add Student");
            System.out.println("2: Display Student ");
            System.out.println("3: Add Student Marks ");
            System.out.println("0: Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    addStudent.addStudentDetails();
                    break;

                case 2:
                    addStudent.displayStudent();
                    break;

                case 3:
                    addStudent.addMarks();
                    break;

                case 0:
                    Exit=true;
                    break;

                default:
                    System.out.println("Enter valid option");
                    break;
            }
        }

    }
}
