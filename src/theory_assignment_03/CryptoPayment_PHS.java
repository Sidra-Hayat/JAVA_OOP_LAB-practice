package theory_assignment_03;

public class CryptoPayment_PHS extends Payment_PHS {

        double amount;
        String transactionId;
        public CryptoPayment_PHS(double amount,String transactionId){
            super(amount, transactionId);


        }

    @Override
    public void processPayment() {
        System.out.println("processing the crypto payment....");
    }

    @Override
    public void cancelPayment() {
        System.out.println("cancelling the crypto payment...");
    }
}
