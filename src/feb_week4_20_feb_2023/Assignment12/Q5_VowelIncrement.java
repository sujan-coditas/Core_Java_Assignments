package feb_week4_20_feb_2023.Assignment12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Increment{
    public void inputValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five names :");

        String arr[] = new String[5];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.next();
        }

        Arrays.sort(arr, Comparator.comparing(s -> s.length()));

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]+" ");
        }
        String str = sb.toString();
        System.out.println("Entered Names are ");
        System.out.println(str);

        String newStr = str.replaceAll("a","b").replaceAll("A","B")
                .replaceAll("e","f").replaceAll("E","F")
                .replaceAll("i","j").replaceAll("I","J")
                .replaceAll("o","p").replaceAll("O","P")
                .replaceAll("u","v").replaceAll("U","V");

        System.out.println("After increment of Vowels : ");
        System.out.println(newStr);
    }
}

public class Q5_VowelIncrement {
    public static void main(String[] args) {
         Increment increment=new Increment();
         increment.inputValues();
    }
}

/*=============OUTPUT=======
* Enter Five names :
sujan
Aryaman
pratiksha
Tanmay
yash
Entered Names are
yash sujan Tanmay Aryaman pratiksha
After increment of Vowels :
ybsh svjbn Tbnmby Brybmbn prbtjkshb
* */
