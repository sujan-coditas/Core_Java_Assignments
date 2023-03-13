package March_Assignments_2023.week3.Assignment19;

import java.util.Scanner;

class Case1{
    public void StudentData(){
        Scanner sc=new Scanner(System.in);
        String name; int id;Float Marks;
        System.out.println("Enter Name ");
        name=sc.nextLine();
        System.out.println("Enter ID ");
        id=sc.nextInt();
        System.out.println("Enter Marks ");
        Marks=sc.nextFloat();
        System.out.println("Name : "+ name +"\n ID : "+id+"\n Marks : "+ Marks);

    }
}


class Case2{
    public void StudentData(){
        Scanner sc=new Scanner(System.in);
        String name,id,marks;
        System.out.println("Enter Name ");
        name=sc.nextLine();
        System.out.println("Enter ID ");
        id=sc.nextLine();
        System.out.println("Enter Marks ");
        marks=sc.nextLine();
        System.out.println("Name : "+ name +"\n ID : "+id+"\n Marks : "+ marks);

    }
}

public class Q1_NextNextLine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean Exit=true;
        while (Exit){
            System.out.println("Enter : \n 0 : Exit \n 1. NextLine \n 2. String Sequence ");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 0:
                    Exit=false;
                    break;

                case 1:
                    Case1 case1= new Case1();
                    case1.StudentData();
                    break;

                case 2:
                    Case2 case2= new Case2();
                    case2.StudentData();
                    break;

                default:
                    System.out.println("Enter valid option");
            }
        }
    }
}
/*Enter :
 0 : Exit
 1. NextLine
 2. String Sequence
Enter your choice:
1
Enter Name
sujan
Enter ID
12
Enter Marks
88
Name : sujan
 ID : 12
 Marks : 88.0
Enter :
 0 : Exit
 1. NextLine
 2. String Sequence
Enter your choice:
2
Enter Name

Enter ID
1
Enter Marks
34
Name :
 ID : 1
 Marks : 34
Enter :
 0 : Exit
 1. NextLine
 2. String Sequence
Enter your choice:
0

Process finished with exit code 0*/