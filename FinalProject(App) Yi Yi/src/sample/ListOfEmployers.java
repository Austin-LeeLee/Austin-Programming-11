package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ListOfEmployers {

    @FXML
    public Button logout;
    @FXML
    public Button userReturn;
    @FXML
    public Button VIEW;
    @FXML
    public Button DELETE;

    @FXML
    public TextField name;
    @FXML
    public TextField birthDate;
    @FXML
    public TextField gender;
    @FXML
    public TextField SIN;
    @FXML
    public TextField startDate;
    @FXML
    public TextField emailAddress;
    @FXML
    public TextField ID;

    public ListView<Employer> listView = new ListView<>();


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


    //from here
    public void viewEmployeeList() {

        //Items not showing up

        name.setText(Employer.getName());
        birthDate.setText(Employer.getBirthDate());
        gender.setText(String.valueOf(Employer.getGender()));
        SIN.setText(String.valueOf(Employer.getSIN()));
        startDate.setText(String.valueOf(Employer.getStartDate()));
        emailAddress.setText(Employer.getEmailAddress());
        ID.setText(String.valueOf(Employer.getID()));


        //View List
        //listView.getItems();

//
        listView.setEditable(false);//editable state
        VIEW.setDisable(false);


        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        //listView.setCellFactory(TextFieldListCell.forListView());

        //to here
    }

    public void deleteEmployeeFromList() {

        int index = listView.getSelectionModel().getSelectedIndex();

        if (index >= 0) {
            listView.getItems().remove(index);
        }
    }
}


