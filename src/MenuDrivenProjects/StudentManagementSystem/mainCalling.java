package MenuDrivenProjects.StudentManagementSystem;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class mainCalling {
    public static void main(String[] args) throws IOException, ParseException {

        Scanner sc=new Scanner(System.in);
        AddStudentDetails addStudentDetails=new AddStudentDetails();
        StudentOperations studentOperations=new StudentOperations();
        boolean Exit=false;
        while(!Exit){
            System.out.println("Enter choice : ");
            System.out.println("1: Add Student ");
            System.out.println("2: Search for Student ");
            System.out.println("3: Update Student Data");
            System.out.println("4: Delete Student ");
            System.out.println("5: Display Student data");
            System.out.println("0: EXIT ");

            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    addStudentDetails.AddStudent();
                    break;
                case 2:
                    studentOperations.search();
                    break;
                case 3:
                    studentOperations.update();
                    break;
                case 4:
                    studentOperations.delete();
                    break;
                case 5:
                    studentOperations.display();
                    break;
                case 0:
                    Exit=true;
                    break;
                default:
                    System.out.println("invalid option");
                    break;

            }
        }
    }
}
