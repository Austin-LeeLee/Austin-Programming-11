import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import static org.junit.Assert.assertEquals;



// Test that the string that is returned from the toString method is the same as I specified in the assignment.
// Test: Deposit.toString() Withdraw.toString() Customer.deposit() Customer.withdraw()
public class test {
    Customer test;

    @Before
    public void setUp(){



        test = new Customer("", 0, 400.0, 500);

    }
    @Test
    public void Deposit_toString(){

        Date date = new Date();
        Deposit deposit = new Deposit(500.0,date, " "); // you didn't supply the object, so I guessed
        String expected = "Deposit of: $"+500.0+ " Date: "+ date + " into account: " + Customer.SAVING; // put the expected value here
        assertEquals(expected, deposit.toString());
    }

    @Test
    public void Withdraw_toString(){

        Date date = new Date();
        Withdraw withdraw = new Withdraw(500.0,date, "User 69420"); // you didn't supply the object, so I guessed
        String expected = "Withdraw of: $"+500.0+ " Date: "+ date + " from account: " + Customer.SAVING ; // put the expected value here
        assertEquals(expected, withdraw.toString());
    }
    @Test
    public void Customer_Deposit(){

        Date date = new Date();

        test.deposit(500.0, date, "");

        Deposit deposit = new Deposit(500.0, date, "");
        String expected = "Deposit of: $"+500.0+ " Date: "+ date + " into account: " + Customer.SAVING; // put the expected value here
        assertEquals(expected, deposit.toString());

    }
    @Test
    public void Customer_withdraw(){



        Date date = new Date();
        test.withdraw(500.0, date, "");
        Withdraw withdraw = new Withdraw(500.0, date, "");
        String expected = "Withdraw of: $"+500.0+ " Date: "+ date + " from account: " + Customer.SAVING; // put the expected value here
        assertEquals(expected, withdraw.toString());
    }
}




