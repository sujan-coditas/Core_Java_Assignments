package feb_week4_20_feb_2023.Assignment14;

public class Conditions {
    public void checkAmount(int amount, int balance) {
        try {
            if (amount <= 0) {
                try {
                    throw new InvalidAmountException("Enter valid amount ");
                } catch (InvalidAmountException e) {
                    //e.printStackTrace();
                    System.out.println();
                }
            } else if (amount > balance) {
                try {
                    throw new InsufficientBalanceException("insufficient balance");
                } catch (InsufficientBalanceException e) {
                   // e.printStackTrace();
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println();
            //e.printStackTrace();
        }
        System.out.println("");
    }
}