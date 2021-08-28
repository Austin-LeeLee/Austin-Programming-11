package sample;

import javafx.collections.ObservableList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Employer extends AfterLogin{

    static String employerName;
    static String employerBirthdate;
    static ObservableList<String> employerGender;
    static int employerSIN;
    static String employerStartDate;
    static String employerEmailAddress;
    static int employerID;


    public Employer(String employerName, String employerBirthdate, ObservableList<String> employerGender, int employerSIN, String employerStartDate, String employerEmailAddress) {
        Employer.employerName = String.valueOf(employerName);
        Employer.employerBirthdate = String.valueOf(employerBirthdate);
        Employer.employerGender = (employerGender);
        Employer.employerSIN = (employerSIN);
        Employer.employerStartDate = String.valueOf(employerStartDate);
        Employer.employerEmailAddress = String.valueOf(employerEmailAddress);
    }


    public Employer() {

    }


    public static String getName() {
        return employerName;
    }

    public static String getBirthDate() {
        return employerBirthdate;
    }

    public static ObservableList<String> getGender() {


        return employerGender;
    }

    public static String getEmailAddress() {
        return employerEmailAddress;
    }

    public static int getSIN() {
        return employerSIN;
    }

    public static String getStartDate() {
        return employerStartDate;
    }

    public static int getID() {

        Random rand = new Random();
        employerID = rand.nextInt(999999999);

        return employerID;
    }

    public void writeToTxt() throws IOException {

        FileWriter fileWriter = new FileWriter("DataPersistence.txt", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("\t\t\t\t\t Name: " + employerName + "\r");
        writer.write("\t\t\t\t\t Gender: " + employerGender + "\r");
        writer.write("\t\t\t\t\t Birthdate: " + employerBirthdate + "\r");
        writer.write("\t\t\t\t\t SIN Number: " + employerSIN + "\r");
        writer.write("\t\t\t\t\t Employment Start Date: " + employerStartDate + "\r");
        writer.write("\t\t\t\t\t Email Address: " + employerEmailAddress + "\r");
        writer.write("\t\t\t\t\t Uniquely Generated Personal ID: " + employerID + "\r");
        writer.write("\r");
        System.out.println(employerID);
        writer.close();

    }

}