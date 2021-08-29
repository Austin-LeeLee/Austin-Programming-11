package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;

import java.io.IOException;

public class ListOfEmployees {

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

    public ListView<Employee> listView = new ListView<>();

    public ObservableList<Employee> employeeObservableList;

    public ComboBox<String> listComboBox = new ComboBox<>();


    public ListOfEmployees() {

        employeeObservableList = FXCollections.observableArrayList();
    }

    private static ListCell<Employee> call(ListView<Employee> employeeListView) {
        return new ListCell<>();
    }

    public void initialize() {
        listView.setItems(employeeObservableList);
        listView.setCellFactory(ListOfEmployees::call);
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
        listComboBox.getSelectionModel().getSelectedItem();
    }


    //from here
    public void viewEmployeeList() {

        //Items not showing up
        listComboBox.setValue("List");
        listComboBox.getItems().add((String.valueOf(Employee.getName())));


        name.setText(Employee.getName());
        birthDate.setText(Employee.getBirthDate());
        gender.setText(String.valueOf(Employee.getGender()));
        SIN.setText(String.valueOf(Employee.getSIN()));
        startDate.setText(String.valueOf(Employee.getStartDate()));
        emailAddress.setText(Employee.getEmailAddress());
        ID.setText(String.valueOf(Employee.getID()));


        //View List
        //listView.getItems();

//
        listView.setEditable(false);//editable state
        VIEW.setDisable(false);

        listComboBox.setCellFactory(TextFieldListCell.forListView());
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



