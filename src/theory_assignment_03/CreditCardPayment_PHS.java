package theory_assignment_03;

public class CreditCardPayment_PHS extends Payment_PHS implements refundable_PHS{
    public CreditCardPayment_PHS(double amount,String transactionId){
        super(amount, transactionId);
    }
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.......");
    }
    @Override
    public void cancelPayment() {
        System.out.println("cancelling credit card payment.....");
    }
    @Override
    public void initiateRefund() {
        if(isRefundEligible()){
            System.out.println("initiating refund to credit card ...");
        }else{
            System.out.println("refund is not eligible....");
        }
    }
    @Override
    public boolean isRefundEligible() {
        return true;
    }
}
