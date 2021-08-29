package sample;

import javafx.collections.ObservableList;

import java.io.*;
import java.util.Random;


public class Employee extends AfterLogin {

    static String employerName;
    static String employerBirthdate;
    static ObservableList<String> employerGender;
    static int employerSIN;
    static String employerStartDate;
    static String employerEmailAddress;
    static int employerID;


    public Employee(String employerName, String employerBirthdate, ObservableList<String> employerGender, int employerSIN, String employerStartDate, String employerEmailAddress) {
        Employee.employerName = String.valueOf(employerName);
        Employee.employerBirthdate = String.valueOf(employerBirthdate);
        Employee.employerGender = (employerGender);
        Employee.employerSIN = (employerSIN);
        Employee.employerStartDate = String.valueOf(employerStartDate);
        Employee.employerEmailAddress = String.valueOf(employerEmailAddress);
    }


    public Employee() {

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


    }}