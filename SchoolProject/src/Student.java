import java.util.Random;

public class Student {

    //(Full Name, Grade, Student id, Course)
    private String firstName;
    private String lastName;
    private int grade;


    public Student(String firstName, int grade, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Student() {

    }

    //Getters and setters

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Add Students to List
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                ", Grade: " + grade + ", Unique Student Number: " + randomNumb;
    }
    Random rand = new Random();
    int randomNumb = rand.nextInt(9999999);


}

