package feb_week4_20_feb_2023.assignment13;


public class Q5_ExceptionHandling {
    public static void main(String[] args) {
        int array[] = new int[10];
        int sum=0;
        try {
            for(int i=0;i<11; i++){
                sum = sum + array[i];
            }
        } catch (Exception e) {
            System.out.println("Array Index Out of Bound Exception occurs");
        }


    }
}

/* when i<11: ArrayIndexOutOfBoundsException

*/
