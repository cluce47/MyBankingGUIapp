// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Client bob= new Client("Bob Smith","Savings1","123QWE",1234);
        Scanner in = new Scanner(System.in);

        String ident="";
            int code=0;
            int count=0;
            do {
                System.out.print("Please enter your client ID: ");
                ident = in.next();

                if (ident.equals(bob.getId())) {
                    System.out.print("And what is your PIN? ");
                    code = in.nextInt();
                    if (code != bob.getPin()){
                        System.out.println("That is the wrong PIN.");
                        count++;
                    }
                } else {
                    System.out.println("That name doesn't exist.");
                }
            }while ((!(bob.getId().equals(ident)) && count < 3 || bob.getPin() != code) && count < 3);
            if (count>=3) {
                System.out.println("To many wrong pin numbers. Goodbye.");
                System.exit(0);
            }
        System.out.println("Welcome to your Banking profile");
        System.out.println(bob.toString());

        System.out.println("\nWhich account type would you like to set up?");
        System.out.println("1. Daily use account\n2. Investment account\n3. Credit Card account");
        System.out.print("Enter the number: ");
        int choice=in.nextInt();

        while (true){
            switch (choice) {
            case 1:
                System.out.print("What is your balance?");
                double balance = in.nextDouble();
                Account general = new Account(balance, "checking1");
                general.toString();
                break;
            case 2:
                System.out.print("How much would you like to invest? ");
                double amount = in.nextDouble();
                Investment invest1 = new Investment(amount , "GIC");
                invest1.toString();
                break;
            case 3:
                Credit credit1 = new Credit(500, "VISA");
                credit1.toString();
                break;
            default:
                System.out.println("Not a valid choice");
            }
            if (choice>=1 && choice <=3){
                break;
            }
        }

    }
}
