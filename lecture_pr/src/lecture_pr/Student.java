package lecture_pr;
public class Student extends User {

        private double gpa;
        private String[] courses;

    public Student() {
        super();
        this.gpa = 0.0;
        this.courses = new String[0];
    }

    public Student(int id, String login, String password, String name, String surname, double gpa, String[] courses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
    }

        public double getGpa() {
        return gpa;
    }

        public void setGpa(double gpa) {
        this.gpa = gpa;
    }

        public String[] getCourses() {
        return courses;
    }

        public void setCourses(String[] courses) {
        this.courses = courses;
    }

        @Override
        public String getData() {
        StringBuilder coursesString = new StringBuilder();
        for (String course : courses) {
            coursesString.append(course).append(" ");
        }
        return super.getData() + ", GPA: " + gpa + ", Courses: " + coursesString.toString().trim();
    }
    }