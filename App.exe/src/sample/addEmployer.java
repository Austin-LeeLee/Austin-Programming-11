package sample;

public class addEmployer {
     static String employerName;
     static String employerBirthdate;
     static String employerAge;
     static String employerGender;
     static String employerContactEmail;

    public addEmployer(String employerName, String employerBirthdate, String employerAge, String employerGender, String employerContactEmail) {
        addEmployer.employerName = String.valueOf(employerName);
        addEmployer.employerBirthdate = String.valueOf(employerBirthdate);  
        addEmployer.employerAge = String.valueOf(employerAge);
        addEmployer.employerGender = String.valueOf(employerGender);
        addEmployer.employerContactEmail = String.valueOf(employerContactEmail);
    }

    public static String getName() { return employerName; }

    public static String getBirthDate() {
        return employerBirthdate;
    }

    public static String getAge() {
        return employerAge;
    }

    public static String getGender() {
        return employerGender;
    }

    public static String getContactEmail() {
        return employerContactEmail;
    }

}