package March_Assignments_2023.week1.Assignment16;


class BookMovieTickets{

    int totalSeats=10;
    public void bookTicket(int seats){
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

class BookingPortal implements Runnable{

    private BookMovieTickets bmt;
    private int seats;

    public BookingPortal(int seats,BookMovieTickets bmt){
        this.seats=seats;
        this.bmt=bmt;
    }
    @Override
    public void run() {
        bmt.bookTicket(seats);
    }
}

public class MultipleUserThreads implements Runnable{

    public void run() {

        try{
        BookMovieTickets bmt = new BookMovieTickets();

        BookingPortal sujan = new BookingPortal(6, bmt);
        Thread t1 = new Thread(sujan);
        t1.start();

        BookingPortal Tanmay = new BookingPortal(5, bmt);
        Thread t2 = new Thread(Tanmay);
        t2.start();


        BookingPortal yash = new BookingPortal(7, bmt);
        Thread t3 = new Thread(yash);
        t3.start();

    }
        catch (Exception e){

        }


    }
}

