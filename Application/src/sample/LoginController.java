package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {

    @FXML
    public Button UserLogin;
    @FXML
    public Button cancelButton;
    @FXML
    public Label WrongLogin;
    @FXML
    public TextField Username;
    @FXML
    public PasswordField Password;

    public void cancelButtonOnAction() {

        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtonOnAction() throws IOException {
        checkLogin();
    }

    public void checkLogin() throws IOException {

         /* Changes (GUI) scene if user enters the correct Username and Password

            Message " ERROR: Username Field Must Not Be Blank " appears if Username field is empty

            Message " ERROR: Password Field Must Not Be Blank " appears if Password field is empty

            Message " ERROR: Username Is Not Correct " appears if Username field is not correct

            Message " ERROR: Password Is Not Correct " appears if Password field is not correct
        */
        Main m = new Main();
        if (Username.getText().equals("1") && Password.getText().equals("123")) {
            m.changeScene("AfterLogin.fxml");

        } else if (Username.getText().isEmpty()) {
            WrongLogin.setText("ERROR: Username Field Must Not Be Blank");

        } else if (Password.getText().isEmpty()) {
            WrongLogin.setText("ERROR: Password Field Must Not be Blank");

        } else if (!Objects.equals(Username.getText(), "1")) {
            WrongLogin.setText("ERROR: Username Is Not Correct");

        } else if (!Objects.equals(Password.getText(), "123"))
            WrongLogin.setText("ERROR: Password Is Not Correct");
    }
}

