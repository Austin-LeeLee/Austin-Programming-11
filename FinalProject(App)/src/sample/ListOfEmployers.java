package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.TextFieldListCell;

import java.io.IOException;

public class ListOfEmployers {

    public Button logout;
    public Button userReturn;
    public Button VIEW;
    public Label Name;
    public Label BirthDate;
    public Label Age;
    public Label Gender;
    public Label ContactEmail;
    public ListView<String> listView = new ListView<>();

    public void initialize() {
        listView.getSelectionModel().getSelectedItem();
    }

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

        //Items not showing up

        Name.setText(addEmployer.getName());
        BirthDate.setText(addEmployer.getBirthDate());
        Age.setText(addEmployer.getAge());
        Gender.setText(addEmployer.getGender());
        ContactEmail.setText(addEmployer.getContactEmail());

        //View List
        listView.getItems().addAll(addEmployer.getName());

//
        listView.setEditable(false);//editable state
        VIEW.setDisable(false);
        VIEW.isCancelButton();


        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.setCellFactory(TextFieldListCell.forListView());

    }
}