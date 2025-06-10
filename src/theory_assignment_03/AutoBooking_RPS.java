package theory_assignment_03;

public class AutoBooking_RPS extends RidePayment_RPS implements RefundableRide_RPS{
    public AutoBooking_RPS(double fareamount, String bookingID) {
        super(fareamount, bookingID);
    }

    @Override
    public void processbooking() {
        System.out.println("processing the auto booking..");
    }

    @Override
    public void cancelbooking() {
        System.out.println("cancelling the auto booking... ");
    }

    @Override
    public void initiateRefund() {
        if(isRefundEligible()){
            System.out.println("initiating auto refund..");
        }else{
            System.out.println("the auto refund is not eligible...");
        }
    }

    @Override
    public boolean isRefundEligible() {
        return fareAmount>1000;
    }
}
