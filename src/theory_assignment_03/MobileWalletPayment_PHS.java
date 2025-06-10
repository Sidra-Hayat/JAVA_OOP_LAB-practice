package theory_assignment_03;

public class MobileWalletPayment_PHS extends Payment_PHS{
    public MobileWalletPayment_PHS(double amount,String transactionId){
        super(amount,transactionId);
    }

    @Override
    public void processPayment() {
        System.out.println("processing the mobile wallet payment....");
    }

    @Override
    public void cancelPayment() {
        System.out.println("cancelling the mobile wallet payment.....");
    }

}
