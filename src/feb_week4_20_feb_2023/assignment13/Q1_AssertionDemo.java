package feb_week4_20_feb_2023.assignment13;


/*
Assertions in Java are a way to ensure that certain conditions are met during runtime.
An assertion is a statement that checks a boolean expression and throws an AssertionError if the expression is false.
It is often used for debugging and testing purposes.
To use assertions in Java, you can use the assert keyword followed by a boolean expression.
 */

import java.util.Scanner;

class Assertion {
    public boolean approveTicket(int age) {
        assert age > 18 && age <= 100 : "Age entered is in valid" ;
        if (age > 18 ) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        boolean ticketApproved = approveTicket(age);
        System.out.println("Ticket approved: " + ticketApproved);
    }
}

public class Q1_AssertionDemo {
    public static void main(String[] args) {
        Assertion assertion = new Assertion();
        assertion.display();
    }
}
/*
===================OUTPUT===============
Enter age:
23
Ticket approved: true


* Enter age:
456
Exception in thread "main" java.lang.AssertionError: Age entered is in valid
	at feb_week4_20_feb_2023.assignment13.Assertion.approveTicket(Q1_AssertionDemo.java:7)
	at feb_week4_20_feb_2023.assignment13.Assertion.display(Q1_AssertionDemo.java:19)
	at feb_week4_20_feb_2023.assignment13.Q1_AssertionDemo.main(Q1_AssertionDemo.java:27)
*/
