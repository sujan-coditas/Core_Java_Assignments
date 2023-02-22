package feb_week4_20_feb_2023.assignment13;

public class Q4_ClassCastException {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj; // This line will throw a ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        } finally {
            System.out.println("Inside the finally block");
        }

    }
}
