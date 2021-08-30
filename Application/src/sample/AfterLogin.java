package sample;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AfterLogin{

    public Label WrongInfo;
    public TextField addName;
    public TextField addSIN;
    public TextField addStartDate;
    public TextField addBirthDate;
    public TextField AddEmailAddress;

    public Button loadList;
    public Button logOut;
    public Button saveInfo;

    public ComboBox<String> SelectGender = new ComboBox<>();

    public ComboBox<Employee> listComboBox = new ComboBox<>();

    public void initialize() {
        //Adds option "Male" , "Female" , "Prefer Not Say" to [SelectGender] ComboBox
        SelectGender.setValue("Select Gender");
        SelectGender.getItems().addAll("Male", "Female", "Prefer Not Say");
    }

    public void userLogOut() throws IOException {

        //Returns to Login Page
        Main m = new Main();
        m.changeScene("login.fxml");
    }

    public void saveBtn() throws IOException {
        //Saves Employee information to text file with add.writeToTxt();
        WrongInfo.setText("Employee Successfully Saved to txt File!");

        Employee emp = new Employee(addName.getText(),  addBirthDate.getText(), SelectGender.getSelectionModel().getSelectedItem(), addSIN.getText(), addStartDate.getText(),AddEmailAddress.getText());
        listComboBox.getItems().add((emp));

        saveInfo.setDisable(addName.getText().length() == 0 || addBirthDate.getText().length() == 0 || addSIN.getText().length() < 10 || addSIN.getText().length() > 10
                || addStartDate.getText().length() == 0 || AddEmailAddress.getText().length() == 0);

        ObservableList<Employee> myList = listComboBox.getItems();
        for (Employee add : myList) {
            add.writeToTxt();

            //Clears text fields
            addName.clear();
            addBirthDate.clear();
            addSIN.clear();
            addStartDate.clear();
            AddEmailAddress.clear();
        }
    }

    public void loadEmployeeList() throws IOException {
    //Load text file [Data Persistence.txt]
    Main m = new Main();
    m.changeScene("AfterLogin.fxml");
    Desktop.getDesktop().open(new File("DataPersistence.txt"));
    }
}





