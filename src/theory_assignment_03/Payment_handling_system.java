package theory_assignment_03;
import java.util.ArrayList;

public class Payment_handling_system {

        private static Object p;

        public static void main(String[] args) {
Payment_PHS credit_payment=new CreditCardPayment_PHS(4000,"Sp24101");
Payment_PHS mobile_wallet=new MobileWalletPayment_PHS(500,"er303");

credit_payment.method_showTransaction();
credit_payment.processPayment();

mobile_wallet.method_showTransaction();
mobile_wallet.processPayment();

if(credit_payment instanceof refundable_PHS){
        refundable_PHS r=(refundable_PHS) credit_payment;
        r.initiateRefund();
}
if(mobile_wallet instanceof refundable_PHS){
        refundable_PHS r=(refundable_PHS) mobile_wallet;
        r.initiateRefund();
}
ArrayList<Payment_PHS> payment=new ArrayList<>();
payment.add(credit_payment);
payment.add(mobile_wallet);
payment.add(new CryptoPayment_PHS(400,"606"));
for(Payment_PHS p:payment){
        p.processPayment();
        p.method_showTransaction();
}
                if (p instanceof refundable_PHS) {
                        ((refundable_PHS) p).initiateRefund();
                } else {
                        System.out.println("This payment type does not support refunds.");
                }

                System.out.println();
BankTransferPayment_PHS bankpayment=new BankTransferPayment_PHS(600,"ty909");
bankpayment.processtransfer();
bankpayment.showtransaction();
bankpayment.initiateRefund();
                System.out.println("Sidra Hayat");
                System.out.println("SP24-BCS-093");
        }
}
