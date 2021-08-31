package sample;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FriendsBook {

    public Label WrongInfo;

    public TextField addName;
    public TextField addBirthDate;
    public TextField addGender;
    public TextField AddEmailAddress;

    public Button save2List1;
    public Button save2List2;
    public Button save2List3;

    public Button saveFriend1;
    public Button saveFriend2;
    public Button saveFriend3;
    public Button HELP;

    public ListView<friend> ListView = new ListView<>();

    public void initialize() {
    }

    public void saveBtnList1() throws IOException {
        //Saves friend information to text file with add.writeToTxt();
        WrongInfo.setText("Friend Successfully Saved To ListView!");

        friend friend = new friend(addName.getText(), addBirthDate.getText(), addGender.getText(), AddEmailAddress.getText());
        ListView.getItems().add((friend));

        save2List1.setDisable(addName.getText().length() == 0 || addBirthDate.getText().length() == 0 ||
                addGender.getText().length() == 0 || AddEmailAddress.getText().length() <= 10);

        ObservableList<friend> myList = ListView.getItems();
        for (friend add : myList) {
            add.writeToTxt1();

            //Clears text fields
            addName.clear();
            addBirthDate.clear();
            addGender.clear();
            AddEmailAddress.clear();
        }
    }


    public void saveBtnList2() throws IOException {
        //Saves friend information to text file with add.writeToTxt();
        WrongInfo.setText("Friend Successfully Saved To ListView!");

        friend friend = new friend(addName.getText(), addBirthDate.getText(), addGender.getText(), AddEmailAddress.getText());
        ListView.getItems().add((friend));

        save2List2.setDisable(addName.getText().length() == 0 || addBirthDate.getText().length() == 0 ||
                addGender.getText().length() == 0 || AddEmailAddress.getText().length() <= 10);

        ObservableList<friend> myList = ListView.getItems();
        for (friend add : myList) {
            add.writeToTxt2();

            //Clears text fields
            addName.clear();
            addBirthDate.clear();
            addGender.clear();
            AddEmailAddress.clear();

        }
    }

    public void saveBtnList3() throws IOException {
        //Saves friend information to text file with add.writeToTxt();
        WrongInfo.setText("Friend Successfully Saved To ListView!");

        friend friend = new friend(addName.getText(), addBirthDate.getText(), addGender.getText(), AddEmailAddress.getText());
        ListView.getItems().add((friend));

        save2List3.setDisable(addName.getText().length() == 0 || addBirthDate.getText().length() == 0 ||
                addGender.getText().length() == 0 || AddEmailAddress.getText().length() <= 10);

        ObservableList<friend> myList = ListView.getItems();
        for (friend add : myList) {
            add.writeToTxt3();

            //Clears text fields
            addName.clear();
            addBirthDate.clear();
            addGender.clear();
            AddEmailAddress.clear();
        }
    }

    public void saveFriendToTXT1() throws IOException {

            //Load text file [FriendGroup1.txt]
            Main m = new Main();
            m.changeScene("Friends_Book.fxml");
            Desktop.getDesktop().open(new File("FriendGroup1.txt"));
        }

    public void saveFriendToTXT2() throws IOException {
        //Load text file [FriendGroup2.txt]
        Main m = new Main();
        m.changeScene("Friends_Book.fxml");
        Desktop.getDesktop().open(new File("FriendGroup2.txt"));

    }

    public void saveFriendToTXT3() throws IOException {
        //Load text file [FriendGroup3.txt]
        Main m = new Main();
        m.changeScene("Friends_Book.fxml");
        Desktop.getDesktop().open(new File("FriendGroup3.txt"));

    }

    public void helpBtn() throws IOException {
        //Load text file [help.txt]
        Main m = new Main();
        m.changeScene("Friends_Book.fxml");
        Desktop.getDesktop().open(new File("help.txt"));
    }
}





