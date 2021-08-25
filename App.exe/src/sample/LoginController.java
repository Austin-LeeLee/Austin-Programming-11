package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    public Button UserLogin;
    @FXML
    private Button cancelButton;
    @FXML
    private Label WrongLogin;
    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;

    public void cancelButtonOnAction() {

        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtonOnAction() throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if (Username.getText().equals("1") && Password.getText().equals("123")) {
            WrongLogin.setText("Success!");

            m.changeScene("AfterLogin.fxml");
        } else if (Username.getText().isEmpty() && Password.getText().isEmpty()) {
            WrongLogin.setText("Username or Password cannot be blank");
        } else {
            WrongLogin.setText("Wrong Username or Password");
        }
    }
}

