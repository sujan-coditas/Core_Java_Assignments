package feb_week5_27_feb_2023.Assignment15;
 class Test extends Thread{
     public void run(){
         System.out.println("this is thread");
     }
 }
public class Q1_RestartThread {
    public static void main(String[] args) {
         Test t= new Test();
         t.start();
         t.start();
    }
}
/*
* No we can not restart a thread once the thread is dead we can't bring it back to life
* The program will give Exception as:
* Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at feb_week5_27_feb_2023.Assignment15.Q1_RestartThread.main(Q1_RestartThread.java:11)
this is thread
* */
