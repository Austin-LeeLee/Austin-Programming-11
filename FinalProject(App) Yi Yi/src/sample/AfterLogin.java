package sample;

import javafx.beans.binding.Bindings;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AfterLogin extends ListOfEmployers {

    public Button logout;
    public Button list;
    public Label WrongInfo;
    public TextField addName;
    public TextField addSIN;
    public TextField addStartDate;
    public TextField addBirthDate;
    public TextField AddEmailAddress;
    public Button save;
    public Button create;
    public ComboBox<String> SelectGender = new ComboBox<>();


    @FXML
    public void initialize() {

        SelectGender.setValue("Select Gender");
        SelectGender.getItems().addAll("Male", "Female", "Prefer Not Say");


    }

    public void EmployeeList() throws IOException {
        Main m = new Main();
        m.changeScene("EmployeeList.fxml");
    }

    public void userLogOut() throws IOException {
        Main m = new Main();
        m.changeScene("login.fxml");
    }

    public void createBtn() {
        create.disableProperty().bind(
                Bindings.isEmpty(addName.textProperty())
                        .or(Bindings.isEmpty(addBirthDate.textProperty()))

                        .or(Bindings.isEmpty(addSIN.textProperty()))
                        .or(Bindings.isEmpty(addStartDate.textProperty()))
                        .or(Bindings.isEmpty(AddEmailAddress.textProperty()))
        );

        WrongInfo.setText("Employee Successfully Added!");


        int SIN = Integer.parseInt(addSIN.getText());
        listView.getItems().add(new Employer(addName.getText(),  addBirthDate.getText(), SelectGender.getItems(), SIN, addStartDate.getText(),AddEmailAddress.getText()));
    }

    public void saveBtn() throws IOException {

        save.disableProperty().bind(
                Bindings.isEmpty(addName.textProperty())
                        .or(Bindings.isEmpty(addBirthDate.textProperty()))

                        .or(Bindings.isEmpty(addSIN.textProperty()))
                        .or(Bindings.isEmpty(addStartDate.textProperty()))
                        .or(Bindings.isEmpty(AddEmailAddress.textProperty()))
        );

        ObservableList<Employer> myList = listView.getItems();
        for (Employer add : myList) {
            add.writeToTxt();
        }
        addName.clear();
        addBirthDate.clear();
        addSIN.clear();
        addStartDate.clear();
        AddEmailAddress.clear();
    }
}





