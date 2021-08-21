package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ListOfEmployers extends AfterLogin {

    public Button logout;
    public Button userReturn;
    public Button view;
    public Label Name;
    public Label BirthDate;
    public Label Age;
    public Label Gender;
    public Label ContactEmail;

    public void userLogOut() throws IOException {
        Main m = new Main();
        m.changeScene("login.fxml");
    }

    public void userReturnBtn() throws IOException {
        Main m = new Main();
        m.changeScene("AfterLogin.fxml");
    }

    public void DisplayList() {

        listView.getSelectionModel().getSelectedItem();
    }
    public void viewEmployeeList() {

        addEmployer View = listView.getSelectionModel().getSelectedItem();
        //addName error
        listView.setEditable(true);//editable state

        Name.setText(View.getName());
        BirthDate.setText(View.getBirthdate());
        Age.setText(Integer.toString(View.getAge()));
        Gender.setText(View.getGender());
        ContactEmail.setText(View.getContactEmail());


    }
}

