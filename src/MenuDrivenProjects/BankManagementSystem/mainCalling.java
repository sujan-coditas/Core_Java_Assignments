package MenuDrivenProjects.BankManagementSystem;

import java.util.Scanner;

public class mainCalling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean Exit=false;
        while(!Exit){
            System.out.println("Enter Details :");
            System.out.println("1: New Connection");
            System.out.println("2: Prepaid ");
            System.out.println("3: View All Users");
            System.out.println("0: Exit");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
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
