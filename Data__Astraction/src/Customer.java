import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Customer {

    private final int accountNumber;
    private static ArrayList<Deposit> deposits;
    private static ArrayList<Withdraw> withdraws;
    private static double checkBalance;
    private static double savingBalance;
    private double savingRate;
    private final String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private static double finalBalance;


    public Customer(int accountNumber, double checkBalance, double savingBalance, double savingRate, String name, double finalBalance) {

        this.accountNumber = accountNumber;
        Customer.checkBalance = checkBalance;
        Customer.savingBalance = savingBalance;
        this.savingRate = savingRate;
        this.name = name;
        Customer.finalBalance = finalBalance;
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
    public String deposit(double amt, Date date, String account) {

        if (amt <= 0) {
            System.out.println("Amount to be deposited should be positive");

        } else {
            System.out.println("$" + amt + " deposited successfully");
            System.out.println("deposit of:\t$ " + amt + "Date: " + date + "into account:" + account + SAVING);
        }

        return "deposit of:\t$" + amt + "Date:" + date + "into account:" + account;
    }

    public String withdraw(double amt, Date date, String account) {

        checkOverdraft(amt, account);
        if (amt <= 0) {
            System.out.println("Amount to be withdrawn should be positive");

        } else {
            finalBalance = finalBalance - amt;
            System.out.println("$" + amt + " withdrawn successfully\nAccount balance: " + (amt + OVERDRAFT));
        }
        return "Withdraw of:\t$" + amt + "Date:" + date + "from account:" + account + "\t the total balance is now:" + finalBalance;
    }

    private void checkOverdraft(double amt, String account) {
        if(finalBalance<amt)
    {
        System.out.println("Insufficient balance\n" + OVERDRAFT + " from bank");
    }
}
    //do not modify
    public void displayDeposits() {
        for (Deposit d : deposits) {
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws() {
        for (Withdraw w : withdraws) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        Date date = new Date();
        Date date1 = new Date();
        String dateDeposited = "Fri Jan 1 00:00:00 PDT 2021";
        String dateWithdrawn = "Sat May 15 00:00:00 PDT 2021";

        int Option = 1;
        double Balance = 0, withdraw = 400.0;

        double Money = savingBalance;
        double Moneyz =checkBalance;
        String Name;
        System.out.println("Please wait, the system is starting...");
        while (Option != 6) {
            Thread.sleep(4000);
            System.out.println("1) Open a new bank account");
            Thread.sleep(250);
            System.out.println("2) Deposit to bank account");
            Thread.sleep(250);
            System.out.println("3) Withdraw to bank account");
            Thread.sleep(250);
            System.out.println("4) Print the deposit information including last transactions + date");
            Thread.sleep(250);
            System.out.println("5) Print the withdrawn information including last transactions + date");
            Thread.sleep(250);
            System.out.println("6) Quit");
            System.out.println();
            System.out.print("                       Enter Option [1-5]: ");
            Option = Integer.parseInt(br.readLine());
            switch (Option) {
                case 1: //Get detailed information regarding user inputs
                    System.out.println("Enter a customer name :");
                    Name = br.readLine();
                    System.out.println("Enter an opening balance : ");
                    Balance = Double.parseDouble(br.readLine());
                    Thread.sleep(250);
                    System.out.println("Creating your account....");
                    Thread.sleep(500);
                    System.out.println("Account has been created\nCustomer name: " + Name + "\nBalance: $" + Balance );
                    break;

                case 2: //Get Second Deposit
                    System.out.println("Enter a deposit amount :");
                    Money =Double.parseDouble(br.readLine());
                    System.out.println("$" + Money + " was deposited");
                    System.out.println("Amount deposited successfully");
                    break;

                case 3: //Get Second Withdraw
                    System.out.println("Enter a withdraw amount :");
                    Moneyz = (Double.parseDouble(br.readLine()));
                    System.out.println("$" + Moneyz + " was withdrawn");
                    System.out.println("Amount Withdrawn successfully");
                    break;

                case 4: // Deposit
                    System.out.println("Deposit of: $" + Balance + " Date: " + dateDeposited + " into account: " + CHECKING);
                    Deposit deposits = new Deposit(Money, date,SAVING );
                    System.out.println(deposits);
                    break;

                case 5: // Withdraw

                    System.out.println("Withdraw of: $" + withdraw + " Date: " + dateWithdrawn + " from account: " + CHECKING);
                    Withdraw withdraws = new Withdraw(Moneyz, date1 ,SAVING );
                    System.out.println(withdraws);
                    break;

                case 6: // Exit Program [code 0]
                    System.out.println("System shutting down.....");
                    Option = 6;
                    break;

                
            }
        }
    }
}



