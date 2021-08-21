package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class EmployeeList {
    public Button logout;
    public Button userReturn;


    @FXML
    private Button userReturnBtn;
    @FXML

    public void userReturnBtn(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("EmployeeList.fxml");


    }


}

