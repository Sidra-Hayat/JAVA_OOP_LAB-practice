package theory_assignment_03;

public class TaxiBooking_RPS extends RidePayment_RPS implements RefundableRide_RPS {

    public TaxiBooking_RPS(double fareamount, String bookingID) {
        super(fareamount, bookingID);

    }
    @Override
    public void processbooking() {
        System.out.println("processing the taxi booking...");
    }

    @Override
    public void cancelbooking() {
        System.out.println("cancelling the taxi booking ...");
    }

    @Override
    public void initiateRefund() {
        if (isRefundEligible()) {
            System.out.println("initiating taxi refund...");
        } else {
            System.out.println("refund is not eligible...");
        }
    }
    @Override
    public boolean isRefundEligible() {
        return true;
    }
}
