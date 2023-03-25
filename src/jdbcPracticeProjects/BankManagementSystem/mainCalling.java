package jdbcPracticeProjects.BankManagementSystem;
import java.util.Scanner;
public class mainCalling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean Exit=true;
        BankFunctions bankFunctions=new BankFunctions();
        while (Exit){
            System.out.println("Enter \n 0: EXIT \n 1: Open Account \n 2: Deposit Cash \n 3: Withdraw Cash");
            int choice= sc.nextInt();
            switch (choice){
                case 0:
                    Exit=false;
                    break;

                case 1:
                    bankFunctions.addUser();
                    break;

                case 2:
                    bankFunctions.cashDeposit();
                    break;

                case 3:
                    bankFunctions.cashWithdraw();
                    break;
            }
        }
    }
}
