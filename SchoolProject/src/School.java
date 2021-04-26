import java.util.ArrayList;


//Students,Teachers,Courses

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    private String student;
    private String teacher;
    private String course;

    public School(String student, String teacher, String course) {
        this.student = student;
        this.teacher = teacher;
        this.course = course;

    }

    public School() {

    }

    //Getter and Setters
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourses() {
        return course;
    }

    public void setCourses(String courses) {
        course = courses;
    }

    //output
    public String toString() {
        return student + teacher + course;
    }
}