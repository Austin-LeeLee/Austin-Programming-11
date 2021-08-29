import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Employee;
import sample.LoginController;

import java.io.File;

public class AppTest{

    LoginController Login;
    Employee Emp;

    @Before
    public void setup() {
        Login = new LoginController();
        Emp = new Employee();

    }

    @Test
    public void checkUser() {

        File file = new File("AfterLogin.fxml");
        boolean exists = file.exists();
        Assert.assertTrue(String.valueOf(file), exists);
    }

    @Test
    public void checkIfFileExists() {
       File file = new File("DataPersistence.txt");
        boolean exists = file.exists();
       Assert.assertTrue(String.valueOf(file), exists);
    }

    @Test
    public void checkIfFileExistsButWithIncorrectFileName() {
        File file = new File("Data_Persistence.txt");
        boolean exists = file.exists();
        Assert.assertFalse(String.valueOf(file), exists);
    }


}