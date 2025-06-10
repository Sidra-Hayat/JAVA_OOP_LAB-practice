package theory_assignment_03;
import java.util.ArrayList;

public class Ride_payment_system {
    private static Object r;

    public static void main(String[] args) {
        ArrayList<RidePayment_RPS> rides = new ArrayList<>();
        TaxiBooking_RPS taxibooking = new TaxiBooking_RPS(500, "rt55");
        BikeBooking_RPS bikebooking = new BikeBooking_RPS(600, "TB77");
        AutoBooking_RPS autobooking = new AutoBooking_RPS(1500, "TA505");
        rides.add(taxibooking);
        rides.add(bikebooking);
        rides.add(autobooking);

        for (RidePayment_RPS r : rides) {
            r.processbooking();
            r.showBookingDetails();
            r.cancelbooking();

            if (r instanceof RefundableRide_RPS) {
                RefundableRide_RPS refundable = (RefundableRide_RPS) r;
                refundable.initiateRefund();
            } else {
                System.out.println("Refund not supported for this ride.");

            }
            System.out.println("---------------");


        }
        System.out.println("Sidra Hayat");
        System.out.println("SP24-BCS-093");
    }
}
