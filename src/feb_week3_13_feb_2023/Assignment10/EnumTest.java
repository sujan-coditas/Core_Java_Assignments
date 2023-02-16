package feb_week3_13_feb_2023.Assignment10;

import java.util.Scanner;

enum colors{RED,GREEN ,YELLOW}
class AssignColor{
    public void showmsg(){
        Scanner sc=new Scanner(System.in);
        String color=sc.next();
        switch(color){
            case "RED":
                System.out.println("RED MEANS STOP");
                break;
            case "GREEN" :
                System.out.println("GREEN MEANS GO");
                break;
            case "YELLOW" :
                System.out.println("DRIVE VERY SLOWLY");
                break;
            default:
                System.out.println("this is default");
                break;
        }
    }
        }
public class EnumTest {
    public static void main(String[] args) {
    AssignColor assignColor=new AssignColor();
    assignColor.showmsg();
    }
}
/* ********* OUTPUT**************
*   RED
RED MEANS STOP
* YELLOW
DRIVE VERY SLOWLY
GREEN
GREEN MEANS GO

*
*/
