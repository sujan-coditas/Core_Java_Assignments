package March_Assignments_2023.week1.Assignment16;

import java.util.Scanner;

public class CallingMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
         char choice;

        do {
            System.out.println("enter choice : \n 1.MultipleUserThread \n 2.Synchronised Method \n 3.Synchronised Block");
            int option = sc.nextInt();



            switch (option) {
                case 1:
                   MultipleUserThread multipleUserThread=new MultipleUserThread();
                   multipleUserThread.multiThreadDemo();
                    break;

                case 2:
                    SynchronisedMethod synchronisedMethod = new SynchronisedMethod();
                    synchronisedMethod.displaySynchronisedMethod();
                    break;

                case 3:
                    SynchronisedBlock synchronisedBlock = new SynchronisedBlock();
                    synchronisedBlock.displaySynchronisedBlock();
                    break;

                default:
                    System.out.println("Enter valid Option");
                    break;
            }


            System.out.println("Do you want to Continue ? (y/n)");
            choice=sc.next().charAt(0);
        } while(choice=='y' || choice=='Y');
    }
}
/*enter choice :
 1.MultipleUserThread
 2.Synchronised Method
 3.Synchronised Block
3
Hello We Welcome you all to watch movies and enjoy your weekend. Thread-0
Hello We Welcome you all to watch movies and enjoy your weekend. Thread-2
Hello We Welcome you all to watch movies and enjoy your weekend. Thread-1
6 Tickets booked  for Thread-0
Remaining Tickets : 4 for Thread-0
Have a great day :)
Couldn't book tickets Thread-1
Have a great day :)
Couldn't book tickets Thread-2
Have a great day :)
Do you want to Continue ? (y/n)
y
enter choice :
 1.MultipleUserThread
 2.Synchronised Method
 3.Synchronised Block
2
6 Tickets booked  for Thread-3
Remaining Tickets : 4for Thread-3
Couldn't book tickets
Couldn't book tickets
Do you want to Continue ? (y/n)
y
enter choice :
 1.MultipleUserThread
 2.Synchronised Method
 3.Synchronised Block
1
6 Tickets booked  for Thread-7
5 Tickets booked  for Thread-8
Remaining Tickets : 4for Thread-7
Remaining Tickets : -1for Thread-8
Couldn't book tickets
Do you want to Continue ? (y/n)
n

Process finished with exit code 0
*/


