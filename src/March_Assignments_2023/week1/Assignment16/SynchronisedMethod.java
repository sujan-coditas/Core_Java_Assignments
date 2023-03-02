package March_Assignments_2023.week1.Assignment16;


class BookMovieTickets1{

    int totalSeats=10;
      synchronized public void bookTicket(int seats){
        if(seats<= totalSeats){
            System.out.println(seats +" Tickets booked  for " +Thread.currentThread().getName());
            int availableSeats=totalSeats-=seats;
            System.out.println("Remaining Tickets : " +availableSeats + "for "+ Thread.currentThread().getName()) ;
        }
        else{
            System.out.println("Couldn't book tickets");
        }
    }
}

class BookingPortal1 implements Runnable{

    private BookMovieTickets bmt;
    private int seats;

    public BookingPortal1(int seats,BookMovieTickets bmt){
        this.seats=seats;
        this.bmt=bmt;
    }
    @Override
    public void run() {
        bmt.bookTicket(seats);

    }
}

public class SynchronisedMethod{

    public void displaySynchronisedMethod() throws InterruptedException {

        BookMovieTickets bmt=new BookMovieTickets();

        BookingPortal1 sujan= new BookingPortal1(6,bmt);
        Thread t1=new Thread(sujan);
        t1.start();

        BookingPortal1 Tanmay= new BookingPortal1(5,bmt);
        Thread t2=new Thread(Tanmay);
        t2.start();


        BookingPortal1 yash= new BookingPortal1(7,bmt);
        Thread t3=new Thread(yash);
        t3.start();
        t1.join();
        t2.join();
        t3.join();

    }
}


