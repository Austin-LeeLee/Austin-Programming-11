package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Friends_Book.fxml")));
        primaryStage.setTitle("Application");
        primaryStage.setScene(new Scene(root, 600, 350));
        primaryStage.show();
    }

    public static void main(String[] args) {
            launch(args);
    }
}

