package theory_assignment_03;

public class CarpoolBooking_RPS extends RidePayment_RPS {
    public CarpoolBooking_RPS(double fareamount, String bookingID) {
        super(fareamount, bookingID);
    }

    @Override
    public void processbooking() {
        System.out.println("processing the carpool booking..");
    }

    @Override
    public void cancelbooking() {
        System.out.println("cancelling the carpool booking... ");
    }
}
