package theory_assignment_03;

public class BikeBooking_RPS extends RidePayment_RPS {
    public BikeBooking_RPS(double fareamount, String bookingID) {
        super(fareamount, bookingID);

    }

    @Override
    public void processbooking() {
        System.out.println("processing Bike booking....");
    }

    @Override
    public void cancelbooking() {
        System.out.println("cancelling Bike booking...");
    }
}
