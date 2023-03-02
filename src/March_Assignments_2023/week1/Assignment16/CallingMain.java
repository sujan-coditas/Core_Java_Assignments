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
                    MultipleUserThreads multipleUserThreads = new MultipleUserThreads();
                    Thread t1=new Thread(multipleUserThreads);
                    t1.start();

                    t1.join();
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
1
Do you want to Continue ? (y/n)
5 Tickets booked  for Thread-2
Remaining Tickets : 5for Thread-2
6 Tickets booked  for Thread-1
Remaining Tickets : -1for Thread-1
Couldn't book tickets
y
enter choice :
 1.MultipleUserThread
 2.Synchronised Method
 3.Synchronised Block

2

Do you want to Continue ? (y/n)
6 Tickets booked  for Thread-4
Remaining Tickets : 4for Thread-4
Couldn't book tickets
Couldn't book tickets
y
enter choice :
 1.MultipleUserThread
 2.Synchronised Method
 3.Synchronised Block
3
Do you want to Continue ? (y/n)
Hello We Welcome you all to watch movies and enjoy your weekend. Thread-7
Hello We Welcome you all to watch movies and enjoy your weekend. Thread-8
6 Tickets booked  for Thread-7
Hello We Welcome you all to watch movies and enjoy your weekend. Thread-9
Remaining Tickets : 4 for Thread-7
Have a great day :)
Couldn't book tickets Thread-9
Have a great day :)
Couldn't book tickets Thread-8
Have a great day :)
n


Process finished with exit code 0
*/


