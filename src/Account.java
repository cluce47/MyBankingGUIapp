import java.text.DecimalFormat;

import java.util.Scanner;
public class Account {
    private double balance;
    private String type;
    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public Account(double bal, String catgry){
        balance=bal;
        type=catgry;
    }
    public double getBalance(){
        return balance;
    }
    public String getType(){
        return type;
    }
    public void setBalance(double amt){
        balance=amt;
    }
    public void setType(String catgry){
        type=catgry;
    }
    private void deposit(double amt){
        balance=balance+amt;
    }
    private void withdraw(double amt){
        balance=balance-amt;
    }

    private void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Here are your options:");
        System.out.println("1. Deposit\n2. Withdraw\n3. View Balance\n4. Exit");
        System.out.print("Your choice: ");


    }
    @Override
    public String toString() {
        menu();
        return "For the account "+type+" the current balance is $"+decfor.format(balance)+".";
    }
}
