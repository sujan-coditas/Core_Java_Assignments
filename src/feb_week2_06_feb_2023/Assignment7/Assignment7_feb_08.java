package feb_week2_06_feb_2023.Assignment7;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Question1 {
    public void displayQuestion1(){
        int array[]={1,5,7,3,9,10,2,4,6,8};
        int target=3;
        // using java.util.Arrays package
        //sort : it sorts elements in ascending order
        Arrays.sort(array);
        System.out.println("Sorted array using built-in sort method : " + Arrays.toString(array));
        //binary-search: returns the index of target element in array
        System.out.println("Sorted array using built-in BinarySearch method :"+ Arrays.binarySearch(array,target));
        // copyOfRange returns range of values from array
        int[] copy = Arrays.copyOfRange(array, 2, 6);
        System.out.println("copyofRange method : ");
        for (int i : copy)
            System.out.print(  i + "  ");
        //fill: fills array complete with the particular vallue
        Arrays.fill(array,1);
        System.out.println("Arrays.fill will fill the complete array with the 1 " + Arrays.toString(array));

        /* ==========OUTPUT===============
            Sorted array using built-in sort method : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

            Sorted array using built-in BinarySearch method :2

            copyofRange method :  3  4  5  6

           Arrays.fill will fill the complete array with the 1 [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
           */
    }
}

class Question2{
    public void displayQuestion2(){
        Integer [] array1={12,13,25,67,21,5,9};

        Arrays.sort(array1);
        System.out.println(" Printing array in  ascending order using Arrays.sort method :: " + Arrays.toString(array1));
        Arrays.sort(array1, Collections.reverseOrder());
        System.out.println(" Printing array in  descending order using collections.reverseOrder method :: " + Arrays.toString(array1));

    }
}

/* ===============OUTPUT===================
Printing array in  ascending order using Arrays.sort method :: [5, 9, 12, 13, 21, 25, 67]
Printing array in  descending order using collections.reverseOrder method :: [67, 25, 21, 13, 12, 9, 5]
*/

class Question3{
    public void displayQuestion3(){
        int array[]={21,45,3,6,78};
        int[] copyOfArray = Arrays.copyOfRange(array, 0, array.length);
        System.out.println("Array copied to other array  : "+ copyOfArray);
        for (int i : copyOfArray)
            System.out.print(  i + "  ");


    }
}
/* ===============OUTPUT===================
Array copied to other array  :
21  45  3  6  78
Process finished with exit code 0
*/

class Question4 {
    public void displayQuestion4() {
        String str[] = {"sujan", "pratiksha", "tanmay", "yash", "sujan"};
        String strNew[] = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.print("the duplicate element in str is :: " + str[i] + "\t");
                }
            }
        }
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                if (str[i].equals(strNew[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                strNew[count++] = str[i];
            }
        }
        System.out.println();
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(strNew, count)));
    }

}

/*  ============OUTPUT===============

the duplicate element in str is :: sujan
Unique elements: [sujan, pratiksha, tanmay, yash]

*/

class Question5{
    public void displayQuestion5(){
        int array[][]={{1,2,3},{4,5},{6,7,8}};
        int array1[][]={{11,12,13},{14,15},{16,17,18}};
        int result=0;
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array1[i].length;j++){
                 result=array[i][j]+array1[i][j];
                System.out.println("Addition of Array[" + i + "][" + j + "] is :: " + result);            }
        }

    }
}
/*
===============OUTPUT=================
Addition of Array[0][0] is :: 12
Addition of Array[0][1] is :: 14
Addition of Array[0][2] is :: 16
Addition of Array[1][0] is :: 18
Addition of Array[1][1] is :: 20
Addition of Array[2][0] is :: 22
Addition of Array[2][1] is :: 24
Addition of Array[2][2] is :: 26

Process finished with exit code 0
*/

class Question6{
    public void displayQuestion6(){
        int array[]={34,54,12,56,89};
        Scanner sc=new Scanner(System.in);
        System.out.println("choose the index value  between 1 to 5  ");
        int n=sc.nextInt();
        System.out.println("Value at the index is :: " + array[n]);
   }
}

/* ==============OUTPUT============

choose the index value  between 1 to 5
2
Value at the index is :: 12

Process finished with exit code 0*/




public class Assignment7_feb_08 {
    public static void main(String[] args) {
        Question1 question1=new Question1();
       // question1.displayQuestion1();
        Question2 question2=new Question2();
       // question2.displayQuestion2();
        Question3  question3=new Question3();
       // question3.displayQuestion3();
        Question4 question4=new Question4();
        //question4.displayQuestion4();
        Question5 question5=new Question5();
        question5.displayQuestion5();
        Question6 question6=new Question6();
        //question6.displayQuestion6();


    }
}
