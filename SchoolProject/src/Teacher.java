public class Teacher {

    private String first_Name;
    private String last_Name;
    private String subject;

//Getters

    public String getFirst_Name() {
        return first_Name;
    }

    public String getSubject() {
        return subject;
    }

    public String getLast_Name() {
        return last_Name;
    }

    //Setters
    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    Teacher() {


        first_Name = "";
        last_Name = "";
        subject = "";
    }



    public Teacher(String first_Name, String last_Name, String subject) {

        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.subject = subject;
    }

    public String toString() {
        return "Name: " + first_Name + " " + last_Name +
                "   Subject:" + subject;
    }
}