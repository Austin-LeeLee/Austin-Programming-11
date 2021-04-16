import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    //Testing code
    public static void main(String[] args) {

        //Array to store students
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> Teachers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int menuChoice;
        do {
            System.out.println("[1]: Add Student\t [2]: Add Teacher\t [3]: View Both Lists\t [4]: Remove Student\t [5]: Remove Teacher\t [10]: Exit");

            System.out.println("Enter a choice: ");
            menuChoice = Integer.parseInt(input.nextLine());

            //Add Student
            if (menuChoice == 1) {
                System.out.println("Full Name:");
                String firstName = input.nextLine();

                System.out.println("Last Name:");
                String LastName = input.nextLine();

                int Grade;
                do {

                    System.out.println("Grade:");
                    Grade = Integer.parseInt(input.nextLine());

                } while (Grade <= 0);

                System.out.println("Select 3 to view your generated Student ID " );


                Student student = new Student(firstName, Grade, LastName);
                students.add(student);
            }
            //Add Teacher
            if (menuChoice == 2) {
                System.out.println("First Name:");
                String TeacherFirstName = input.nextLine();

                System.out.println("Last Name");
                String TeacherLastName = input.nextLine();

                System.out.println("Subject:");
                String Subject = input.nextLine();

                Teacher teacher = new Teacher(TeacherFirstName, TeacherLastName, Subject);
                Teachers.add(teacher);

            }
            //Display student list
            //Display teacher list
            if (menuChoice == 3) {

                //Element is a custom type

                System.out.println("Student(s) Added:");
                for (Student student : students) {
                    System.out.println(student);

                    for (int i = 10; i < students.size(); i++) {
                        System.out.println(students.get(i - 100));
                    }
                }
                System.out.println("\nTeachers(s) Added:");
                for (Teacher teacher : Teachers)
                    System.out.println(teacher);

                for (int x = 10; x < Teachers.size(); x++) {
                    System.out.println(Teachers.get(x - 100));

                }
            }
            //Removes student whose name is at the top of the list
            if (menuChoice == 4) {
                int Index = 0;
                students.remove(Index);
                students.remove(new Student());
                System.out.println("The First Student On The List Has Been Removed");
            }
            //Removes teacher whose name is at the top of the list
            if (menuChoice == 5) {
                int index = 0;
                Teachers.remove(index);
                Teachers.remove(new Teacher());
                System.out.println("The First Teacher On The List Has Been Removed");
            }
        }
        //Exit
        while (menuChoice < 10) ;

    }
}
