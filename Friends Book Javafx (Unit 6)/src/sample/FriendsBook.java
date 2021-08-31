package sample;

import javafx.scene.control.*;

public class FriendsBook {

    public Label WrongInfo;
    public TextField addName;
    public TextField addBirthDate;
    public TextField addGender;
    public TextField AddEmailAddress;

    public Button deleteFriend;
    public Button friendListView;
    public Button save;


    public TextField txtFieldName;
    public TextField txtFieldEmailAddress;
    public TextField txtFieldBirthdate;
    public TextField txtFieldGender;

    public ListView<friend> ListView = new ListView<>();

    public void initialize() {
    }

    public void saveBtn(){

        WrongInfo.setText("Friend Successfully Saved To ListView!");

        friend friend = new friend(addName.getText(),  addBirthDate.getText(), addGender.getText(),AddEmailAddress.getText());
        ListView.getItems().add((friend));

            //Clears text fields
            addName.clear();
            addBirthDate.clear();
            addGender.clear();
            AddEmailAddress.clear();
        }

    public void DisplayFriend(){

        friend friend = ListView.getSelectionModel().getSelectedItem();
        txtFieldName.setText(friend.friendName);
        txtFieldBirthdate.setText(friend.getFriendBirthdate());
        txtFieldGender.setText(friend.getFriendGender());
        txtFieldEmailAddress.setText(friend.getFriendEmailAddress());
        ListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        ListView.setEditable(false);
    }

    public void deleteBtn() {

        int index = ListView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            ListView.getItems().remove(index);
        }
        txtFieldName.clear();
        txtFieldBirthdate.clear();
        txtFieldGender.clear();
        txtFieldEmailAddress.clear();
    }
}





