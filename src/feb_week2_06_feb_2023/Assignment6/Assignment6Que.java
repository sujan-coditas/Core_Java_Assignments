package feb_week2_06_feb_2023.Assignment6;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

class Question12{
    public void displayque12(){
        int number1 = 3;
        // here it will check whether 3>=0 (it is greater)
        if (number1 >= 0) {
            //here it checks for number to be == 0 (its not) so it skips the if block and else block is executed
            if (number1 == 0) {
                System.out.println("first");
            } else
                System.out.println("second");
        }
        // this statement will print irrespective of the conditions given in above block of code.
        System.out.println("third");
    }
}

/*
************************* OUTPUT**************************
second
third

Process finished with exit code 0
 */


class Question3 {
    public void displayQuestion3() {
        int var = 1;
        switch (var) {
            case 1:
                System.out.println("low");
                break;

            case 2:
                System.out.println("medium");
                break;

            case 3:
                System.out.println("high");
                break;

            default:
                System.out.println("abnormal");
                break;
        }
    }
}
/*   ***************** OUTPUT ***************
         low
* */


class Question4{
    public void displayQuestion4 (){
        int m=1,x=0;
        if(m==0){
            x=x+2;
            System.out.println("X = "+ x);
        }
        else if (m==1) {
            x=x+4;
            System.out.println("X = "+x);
        }
        else if (m==2) {
            x=x+6;
            System.out.println("X = "+x);
        }
    }
}
/* ****************** OUTPUT **********************
    Note: initially the value of x=0;
            here m=1 was selected
             so it gave the ouput as

               X = 4 (0+4=4)
 */

class Question5{
    public void displayQuestion5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers for comparison ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();

        if(number1>number2)
            System.out.println(number1 + " is greater than "+number2);
        else
            System.out.println(number2 + " is greater than "+number1);

    }
}
/*  *************** OUTPUT ***************
enter 2 numbers for comparison
78
76
78 is greater than 76
**/

class Question6{
    public void displayQuestion6(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.println("enter age of  people");
            int age = sc.nextInt();

            if (age < 18)
                System.out.println("child");
            else if (age >= 18 && age <= 40)
                System.out.println("youngster");
            else if (age > 40 && age<=100)
                System.out.println("old");
        }

    }

}

/*  ************* OUTPUT ***************
*   enter age of  people
23
youngster
enter age of  people
56
old
enter age of  people
12
child

 Process finished with exit code 0
 */


class Question7_1{
    public void dispplayquestion71(){
        String str[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
         for(int i=0;i< str.length;i++){

             if(str[i]=="thursday"){
                 continue;
             }
             System.out.println(str[i]);
         }
    }
}
/* ***********OUTPUT **********************
  monday
tuesday
wednesday
friday
saturday
sunday
*/

class Question7_2{
    public void displayquestion7_2(){
        String weekdays[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        String TodaysDay="tuesday";
        for(int i=0;i< weekdays.length;i++){

            if(weekdays[i]==TodaysDay){
                continue;
            }
            System.out.println(weekdays[i]);
        }
    }
    }

    /*  ******OUTPUT**************
 monday
wednesday
thursday
friday
saturday
sunday*/
    class Question7_3 {
        public void displayquestion7_3() {
            LocalDate today = LocalDate.now();
            int date = today.getDayOfMonth();

            for(int i =1 ; i<=date; i++){
                System.out.println(i);
            }
             }

    }
    /*
    * ************* OUTPUT **********************

1
2
3
4
5
6

Process finished with exit code 0 */

class  Question8{
    public void displayquestion81(){
        int n=5;
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  void displayquestion82(){
        int n=5;
        char ch='A';
        for(int i=0;i<=n;i++){
            ch='A';
            for(int j=i;j<=n;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        for(int i=2;i<=n+1;i++){
            ch='A';

            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
    public void question83(){
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0; j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n;j++){
                System.out.print("*");
            }
            for(int j=i; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void question84(){
        int n=5;
        char ch='A';
        for(int i=0;i<=n;i++){
            ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++){
            ch='A';
            for(int j=i;j<n;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public void question85() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

public void question86(){
    int n = 5;
    char ch = 'A';

    for (int i = 1; i <= n; i++) {
        ch = 'A';
        for (int j = 1; j <= i; j++) {
            System.out.print(ch++);
        }
        ch--;
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(--ch);
        }
        System.out.println();
    }
}
}








public class Assignment6Que {
    public static void main(String[] args) {
        Question12 question12 = new Question12();
       question12.displayque12();
        Question3 question3 = new Question3();
        question3.displayQuestion3();
        Question4 question4=new Question4();
        question4.displayQuestion4();
        Question5 question5=new Question5();
        question5.displayQuestion5();
        Question6 question6=new Question6();
        question6.displayQuestion6();
        Question7_1 question7_1=new Question7_1();
        question7_1.dispplayquestion71();
        Question7_2 question7_2=new Question7_2();
        question7_2.displayquestion7_2();
        Question7_3 question7_3=new Question7_3();
        question7_3.displayquestion7_3();
        Question8 question8=new Question8();
        question8.displayquestion81();
        question8.displayquestion82();
        question8.question83();
        question8.question84();
        question8.question85();
        question8.question86();




    }
}

