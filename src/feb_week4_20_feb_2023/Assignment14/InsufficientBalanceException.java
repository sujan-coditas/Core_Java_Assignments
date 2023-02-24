package feb_week4_20_feb_2023.Assignment14;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String s) {
        System.out.println("Insufficient balance");
    }
}
