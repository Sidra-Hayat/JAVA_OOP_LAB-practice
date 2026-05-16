package lab2_3;

import java.util.Scanner;

public class account {
    Scanner sc=new Scanner(System.in);
    private int balance;
    public account(){
        balance=0;
    }
    public account(int a){
        this.balance=a;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit_amount(){
        System.out.println("enter the amount to deposit!!!");
       int deposit=sc.nextInt();
       balance+=deposit;
        System.out.println("amount successfully deposited !!!");
    }
    public void withdraw_amount(){
        System.out.println("enter the amount to withdraw from account!!!");
int withdraw=sc.nextInt();
if(withdraw<=balance) {
    balance -= withdraw;
    System.out.println("amount withdrawn successfully !!");
}else{
    System.out.println("you have insufficient balance:");
}
    }
public void display_balance(){
    System.out.println("total balance in the account is ::   "+balance);
}
}
