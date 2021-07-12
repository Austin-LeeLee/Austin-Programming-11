import java.util.Date;
public class Withdraw {
    private final double amount;
    private final Date date;
    private final String account;

    Withdraw(double amount, Date date, String account) {
        this.amount = amount;
        this.date = date;
        this.account = account;

    }


    public String toString() {
        //your code here
        return "Withdraw of: $" + amount + " Date: " + date + " from account: " + Customer.SAVING ;
    }
}