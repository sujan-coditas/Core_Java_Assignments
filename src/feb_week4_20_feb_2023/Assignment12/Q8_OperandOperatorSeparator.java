package feb_week4_20_feb_2023.Assignment12;

import java.util.Scanner;
import java.util.StringTokenizer;

class Separator {
    void displayOperand() {
        StringTokenizer stringTokenizer = new StringTokenizer("3+(20%2)*(20/2)", "+(%)*/");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.print(" "+stringTokenizer.nextToken());
        }
    }
    void displayOperator() {
        StringTokenizer stringTokenizer = new StringTokenizer("3+(20%2)*(20/2)", "3202");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.print(" "+stringTokenizer.nextToken());
        }
    }
}
public class Q8_OperandOperatorSeparator {
    public static void main(String[] args) {
        Separator separator=new Separator();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter option 1.operator \n \t 2.operators ");
        int option=sc.nextInt();
        switch(option){
            case 1:
                separator.displayOperand();
                break;

            case 2:
                separator.displayOperator();
                break;

            default:
                System.out.println("enter valid option");
                break;

        }

    }
}
/*=============OUTPUT==========
Enter option 1.operator
 	 2.operators
1
 3 20 2 20 2

Enter option 1.operator
 	 2.operators
2
 +( % )*( / )

*/
