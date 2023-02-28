package feb_week5_27_feb_2023.Assignment15;

 class FindOdd implements Runnable {

     @Override
     public void run() {

         for(int i=1;i<10;i++){
             if(i %2 !=0) {
                 System.out.println(Thread.currentThread().getName()+" "+i);
             }
         }

     }
 }
public class Q4_PrintOdd {
    public static void main(String[] args) {
        FindOdd findOdd=new FindOdd();
        FindOdd findOdd1=new FindOdd();


        Thread thread=new Thread(findOdd);
        Thread thread1=new Thread(findOdd1);
        thread.start();
        thread1.start();

    }
}
/*
* Thread-0 1
Thread-1 1
Thread-0 3
Thread-1 3
Thread-1 5
Thread-0 5
Thread-1 7
Thread-0 7
Thread-1 9
Thread-0 9
* */