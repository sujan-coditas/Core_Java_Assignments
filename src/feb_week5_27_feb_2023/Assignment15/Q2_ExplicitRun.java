package feb_week5_27_feb_2023.Assignment15;

class Test1 implements  Runnable {

    @Override
    public void run() {
        System.out.println("this is thread");
    }
}
public class Q2_ExplicitRun {
    public static void main(String[] args) {
 Test1 test1= new Test1();
 Thread thread=new Thread(test1);
  thread.start();

  // explicitly calling run
         test1.run();
    }
}
/*Yes, we can explicitly call the run() method in multithreading in Java.
 However, if we call the run() method directly, it will run the code in the current thread,
 and it will not create a new thread.
To create a new thread and execute the run() method in that thread, we need to call the start() method.

  main thread will also run explicitly with all other threads.
*/
