package theory_assignment_03;

public  abstract class RidePayment_RPS {
    double fareAmount;
    String bookingId;
public RidePayment_RPS(double fareamount,String bookingID){
    this.fareAmount=fareamount;
    this.bookingId=bookingID;

}
public void showBookingDetails(){
    System.out.println("fare amount: "+fareAmount+" bookingID: "+bookingId);
}
public abstract void processbooking();
    public abstract void cancelbooking();
}
