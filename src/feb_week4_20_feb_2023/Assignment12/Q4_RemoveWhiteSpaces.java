package feb_week4_20_feb_2023.Assignment12;


import java.util.Scanner;

class WhiteSpaces{
    void displayWhiteSpaces(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String : ");

            String str1 = sc.nextLine();
            String str = str1.toLowerCase();
            int length = str.length();

            System.out.println("After removing white Spaces : "+str1.trim());
            System.out.println("unicode value of char "+str1.charAt(5)+"  is : "+str.codePointAt(5));

        }
    }

public class Q4_RemoveWhiteSpaces {

    public static void main(String[] args) {
        WhiteSpaces whiteSpaces =new WhiteSpaces();
        whiteSpaces.displayWhiteSpaces();
    }
}
/*============OUTPUT==========
* Enter String :
   sujan shaikh
After removing white Spaces : sujan shaikh
unicode value of char j  is : 106
*/
