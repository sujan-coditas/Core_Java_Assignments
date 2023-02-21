package feb_week4_20_feb_2023.Assignment12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class InputStrings{
    public void displayStrings(){
        Scanner sc=new Scanner(System.in);
        String stringArray[]=new String[3];
        System.out.println("Enter 3 Strings : ");
        stringArray[0]=sc.next();
        stringArray[1]=sc.next();
        stringArray[2]=sc.next();

        Arrays.sort(stringArray, Comparator.comparing(s -> s.length()));

        for(int i=0;i<stringArray.length;i++){
            System.out.print(stringArray[i]+" ");
        }
        }


    }

public class Q1_StringsInAscending {
    public static void main(String[] args) {
        InputStrings inputStrings=new InputStrings();
inputStrings.displayStrings();
    }
}
/*================OUTOUT============
* Enter 3 Strings :
sujan
Aryaman
Tanmay
sujan Tanmay Aryaman
* */
