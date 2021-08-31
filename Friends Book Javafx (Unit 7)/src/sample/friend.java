package sample;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class friend {

     String friendName;
     String friendBirthdate;
     String friendGender;
     String friendEmailAddress;


    public friend(String friendName, String friendBirthdate, String friendGender, String friendEmailAddress) {
        this.friendName = friendName;
        this.friendBirthdate = friendBirthdate;
        this.friendGender = friendGender;
        this.friendEmailAddress = friendEmailAddress;
    }

    public friend() {

    }
    public String toString() {
        return friendName;
    }

    public void writeToTxt1() throws IOException {

        FileWriter fileWriter = new FileWriter("FriendGroup1.txt", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("\t\t\t\t\t Name: " + friendName + "\r");
        writer.write("\t\t\t\t\t Gender: " + friendGender + "\r");
        writer.write("\t\t\t\t\t Birthdate: " + friendBirthdate + "\r");
        writer.write("\t\t\t\t\t Email Address: " + friendEmailAddress + "\r");
        writer.write("\r");
        //Close write to file
        writer.close();
    }
    public void writeToTxt2() throws IOException {

        FileWriter fileWriter = new FileWriter("FriendGroup2.txt", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("\t\t\t\t\t Name: " + friendName + "\r");
        writer.write("\t\t\t\t\t Gender: " + friendGender + "\r");
        writer.write("\t\t\t\t\t Birthdate: " + friendBirthdate + "\r");
        writer.write("\t\t\t\t\t Email Address: " + friendEmailAddress + "\r");
        writer.write("\r");
        //Close write to file
        writer.close();
    }

    public void writeToTxt3() throws IOException {

        FileWriter fileWriter = new FileWriter("FriendGroup3.txt", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("\t\t\t\t\t Name: " + friendName + "\r");
        writer.write("\t\t\t\t\t Gender: " + friendGender + "\r");
        writer.write("\t\t\t\t\t Birthdate: " + friendBirthdate + "\r");
        writer.write("\t\t\t\t\t Email Address: " + friendEmailAddress + "\r");
        writer.write("\r");
        //Close write to file
        writer.close();
    }
}
