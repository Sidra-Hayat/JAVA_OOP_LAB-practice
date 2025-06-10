package theory_assignment_03;

public abstract class Payment_PHS {
    double amount;
    String transactionId;
    public Payment_PHS(double amount,String transactionId){
        this.amount=amount;
        this.transactionId=transactionId;

    }
    public void method_showTransaction(){
        System.out.println("amount:"+amount+", transactionID: "+transactionId);

    }
    public abstract void processPayment();
    public abstract void cancelPayment();

}
