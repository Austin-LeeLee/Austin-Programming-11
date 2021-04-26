import java.util.ArrayList;


//There's literally nothing to add to school class as my main class has it all. I don't understand why you want me to add a school class
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    private String course;


    public School(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public School() {

    }

    //output
    public String toString() {
        return course;
    }
}