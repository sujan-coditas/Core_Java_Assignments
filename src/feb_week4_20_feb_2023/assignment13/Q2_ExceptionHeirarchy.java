package feb_week4_20_feb_2023.assignment13;

/*
 exceptions are organized into a class hierarchy.
 The root of this hierarchy is the Throwable class.
 The Throwable class has two main subclasses:
        Exception
        Error.

The Exception class represents exceptional conditions that can be caught and handled by the application.
 The Exception class has several subclasses, including RuntimeException, IOException, SQLException, and many others.

 The Error class represents exceptional conditions that are not expected to be caught or handled by the application.
  Error and its subclasses represent serious problems that are beyond the control of the application,
   such as OutOfMemoryError or StackOverflowError.

* Throwable
    |
    +-- Error
    |     |
    |     +-- AssertionError
    |     +-- OutOfMemoryError
    |     +-- StackOverflowError
    |     +-- ...
    |
    +-- Exception
          |
          +-- RuntimeException
          |     |
          |     +-- NullPointerException
          |     +-- ArrayIndexOutOfBoundsException
          |     +-- ArithmeticException
          |     +-- ...
          |
          +-- IOException
          |     |
          |     +-- FileNotFoundException
          |     +-- SocketException
          |     +-- ...
          |
          +-- SQLException
                |
                +-- SQLSyntaxErrorException
                +-- SQLDataException
                +-- ...
*/
public class Q2_ExceptionHeirarchy {
}
