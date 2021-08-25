package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

public class Main extends Application {
    private static Stage stg;
    private ListOfEmployers controller;
    private final File file = new File("DataPersistence.txt");
    FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/home.fxml"));

    @Override
    public void start(Stage primaryStage) throws Exception {
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        primaryStage.setTitle("App.exe");
        primaryStage.setScene(new Scene(root, 600, 350));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        stg.getScene().setRoot(pane);
    }

    public void save(ListView<String> library) throws IOException {
        File file = new File ("DataPersistence.txt"); //creates text file
        PrintWriter output = new PrintWriter(file);

        if(file.exists()) { //if the file exists
            output.println(library);
            output.close();

        }

        if(!file.exists()) { //if file doesn't exist
            System.out.println("Error creating file");
        }
    }




    public static void main(String[] args) {
        launch(args);
    }
}