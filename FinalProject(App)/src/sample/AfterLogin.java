package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AfterLogin {

    public Button logout;
    public Button list;
    public ListView<addEmployer> listView = new ListView<>();
    public Label WrongInfo;
    public TextField addName;
    public TextField addAge;
    public TextField addBirthDate;
    public TextField addGender;
    public TextField addContactEmail;

    public void EmployeeList() throws IOException {
        Main m = new Main();
        m.changeScene("EmployeeList.fxml");
    }

    public void userLogOut() throws IOException {
        Main m = new Main();
        m.changeScene("login.fxml");
    }

    public void saveBtn() {

        String Name = addName.getText();
        String Birthdate = addBirthDate.getText();
        int Age = Integer.parseInt((addAge.getText()));
        String Gender = addGender.getText();
        String Email = addContactEmail.getText();

        addEmployer View = new addEmployer(Name, Birthdate, Age, Gender, Email);
        listView.getItems().add((View));

        if (addName.getText().isEmpty() || addBirthDate.getText().isEmpty()
                || addAge.getText().isEmpty() || addGender.getText().isEmpty()
                || addContactEmail.getText().isEmpty()) {

            WrongInfo.setText("Employer Information cannot be blank");

        } else {
            WrongInfo.setText("Success!");
        }

    }
}