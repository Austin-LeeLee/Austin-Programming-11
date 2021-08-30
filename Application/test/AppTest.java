import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Employee;
import sample.Main;

import java.io.File;

public class AppTest {

    Employee employeeID;


    @Before
    public void setup() {
        employeeID = new Employee();

    }

    @Test
    public void checkIfFileExists() {
       /*Created this test to check if text file [DataPersistence.txt]
         exists. I have set it so that if the file does not exist, the
         test would fail, and if the file exists, the test would pass.
         Method used: exists()
        */
        File file = new File("DataPersistence.txt");
        boolean exists = file.exists();
        Assert.assertTrue(String.valueOf(file), exists);
    }

    @Test
    public void checkIfFileExistsButWithIncorrectFileName() {
        /*Created this test to check if text file [Data__Persistence.txt]
         (a made up file and does not exist) exists. I have set it so that
         if the file does not exist, the test would pass , and if the file
         exists, the test would fail.
         Method used: exists()
        */
        File file = new File("Data__Persistence.txt");
        boolean exists = file.exists();
        Assert.assertFalse(String.valueOf(file), exists);
    }

    @Test
    public void testGUI() throws InterruptedException {

        /*This basic JUnit test for my Javafx application
          is created to test my GUI app if everything works
          properly
         */

        Thread thread = new Thread(() -> {
            new JFXPanel(); // Initializes the JavaFx Platform
            Platform.runLater(() -> {
                try {
                    new Main().start(new Stage()); // Create and
                    // initialize
                    // my application.
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });
        thread.start();// Initialize the thread
        Thread.sleep(10000); /*I've set it to 10000 tread so you could go
                                    through my application
                                    */
    }

}