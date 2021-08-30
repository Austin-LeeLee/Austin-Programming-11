package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;


public class Employee  {

    static String employeeName;
    static String employeeBirthdate;
    static String employeeGender;
    static String employerSIN;
    static String employeeStartDate;
    static String employeeEmailAddress;
    static int employeeID;


    public Employee(String employerName, String employeeBirthdate, String employerGender, String employerSIN, String employerStartDate, String employerEmailAddress) {
        Employee.employeeName = (employerName);
        Employee.employeeBirthdate = String.valueOf(employeeBirthdate);
        Employee.employeeGender = (employerGender);
        Employee.employerSIN = String.valueOf((employerSIN));
        Employee.employeeStartDate = String.valueOf(employerStartDate);
        Employee.employeeEmailAddress = String.valueOf(employerEmailAddress);
    }

    public Employee() {

    }
    public static int getID() {

        employeeID = ThreadLocalRandom.current().nextInt(100000000, 999999999);
        return employeeID;
    }

    public static String getName() {
        return employeeName;
    }

    public void writeToTxt() throws IOException {

        /* Saves employee's Name, Gender, Birthdate,
          SIN Number, Employment Start Date, Email Address,
          and an uniquely Generated Employee ID
        */
        FileWriter fileWriter = new FileWriter("DataPersistence.txt", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("\t\t\t\t\t Name: " + employeeName + "\r");
        writer.write("\t\t\t\t\t Gender: " + employeeGender + "\r");
        writer.write("\t\t\t\t\t Birthdate: " + employeeBirthdate + "\r");
        writer.write("\t\t\t\t\t SIN Number: " + employerSIN + "\r");
        writer.write("\t\t\t\t\t Employment Start Date: " + employeeStartDate + "\r");
        writer.write("\t\t\t\t\t Email Address: " + employeeEmailAddress + "\r");
        writer.write("\t\t\t\t\t Uniquely Generated Employee ID: " + getID() + "\r");
        writer.write("\r");
        //Test if employee ID in output matches employee ID in txt file
        System.out.println(employeeID);
        //Close write to file
        writer.close();


    }}