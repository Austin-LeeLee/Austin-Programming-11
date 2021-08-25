package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AfterLogin extends ListOfEmployers {

    public Button logout;
    public Button list;
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

        if (addName.getText().isEmpty()) {
            WrongInfo.setText("TEXTFIELD CANNOT BE BLANK");
        } else if (addBirthDate.getText().isEmpty()) {
            WrongInfo.setText("TEXTFIELD CANNOT BE BLANK");
        } else if (addAge.getText().isEmpty()) {
            WrongInfo.setText("TEXTFIELD CANNOT BE BLANK");
        } else if (addGender.getText().isEmpty()) {
            WrongInfo.setText("TEXTFIELD CANNOT BE BLANK");
        } else if (addContactEmail.getText().isEmpty()) {
            WrongInfo.setText("TEXTFIELD CANNOT BE BLANK");

        } else WrongInfo.setText("Success!!!");



        String name = addName.getText();
        String birthDate = addBirthDate.getText();
        String age = addAge.getText();
        String gender = addGender.getText();
        String contactEmail = addContactEmail.getText();

        addEmployer view = new addEmployer(name, birthDate, age, gender, contactEmail);
        listView.getItems().add(String.valueOf((view)));
    }
}




