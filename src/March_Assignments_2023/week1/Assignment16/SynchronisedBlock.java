package March_Assignments_2023.week1.Assignment16;

class BookMovieTickets2 {
    int totalSeats = 10;

    public void bookTicket(int seats) {
        System.out.println("Hello We Welcome you all to watch movies and enjoy your weekend. " + Thread.currentThread().getName());

        synchronized (this) {
            if (seats <= totalSeats) {
                System.out.println(seats + " Tickets booked  for " + Thread.currentThread().getName());
                int availableSeats = totalSeats -= seats;
                System.out.println("Remaining Tickets : " + availableSeats + " for " + Thread.currentThread().getName());
            } else {
                System.out.println("Couldn't book tickets " + Thread.currentThread().getName());
            }
        }
        System.out.println("Have a great day :) ");
    }
}

class BookingPortal2 implements Runnable {
    private BookMovieTickets2 bmt;
    private int seats;

    public BookingPortal2(int seats, BookMovieTickets2 bmt) {
        this.seats = seats;
        this.bmt = bmt;
    }

    @Override
    public void run() {
        bmt.bookTicket(seats);

    }
}

public class SynchronisedBlock {
  public void displaySynchronisedBlock(){
      {
          BookMovieTickets2 bmt = new BookMovieTickets2();

          BookingPortal2 sujan = new BookingPortal2(6, bmt);
          Thread t1 = new Thread(sujan);
          t1.start();

          BookingPortal2 tanmay = new BookingPortal2(5, bmt);
          Thread t2 = new Thread(tanmay);
          t2.start();

          BookingPortal2 yash = new BookingPortal2(7, bmt);
          Thread t3 = new Thread(yash);
          t3.start();
      }
  }
}
