package theory_assignment_03;

public class BankTransferPayment_PHS implements refundable_PHS {
    double amount;
    String transactionId;

    public BankTransferPayment_PHS(double amount, String transactionId){
        this.amount=amount;
        this.transactionId=transactionId;
    }
    public void showtransaction(){
        System.out.println("amount: "+amount+" transactionID: "+transactionId);
    }
    public void processtransfer(){
        System.out.println("processing amount transfer....");
    }
    public void canceltransfer(){
        System.out.println("cancelling the amount transfer....");
    }
    @Override
    public void initiateRefund() {
        if(isRefundEligible()){
            System.out.println("initiating bank transfer refund...");
        }else{
            System.out.println("the bank transfer refund is not eligible ....");
        }
    }
    @Override
    public boolean isRefundEligible() {
        return amount<1000;
    }
}
