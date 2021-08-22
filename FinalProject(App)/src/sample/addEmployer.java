package sample;

public class addEmployer {
     String employerName;
     String employerBirthdate;
     int employerAge;
     String employerGender;
     String employerContactEmail;

    public addEmployer(String employerName, String employerBirthdate, int employerAge, String employerGender, String employerContactEmail) {
        this.employerName = employerName;
        this.employerBirthdate = employerBirthdate;
        this.employerAge = employerAge;
        this.employerGender = employerGender;
        this.employerContactEmail = employerContactEmail;
    }

    public String getName() { return employerName; }

    public String getBirthdate() {
        return employerBirthdate;
    }

    public int getAge() {
        return employerAge;
    }

    public String getGender() {
        return employerGender;
    }

    public String getContactEmail() {
        return employerContactEmail;
    }

}