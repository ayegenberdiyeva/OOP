
import java.util.ArrayList;
public class Course{
    public String courseName;
    public ArrayList<Student> students;

    public Course(String courseName, ArrayList<Student> students) {
        this.courseName = courseName;
        this.students = students;
    }

    public Course(String courseName) {
        this.courseName = courseName;
        ArrayList<Student> students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
