package lecture_pr;
public class Staff extends User {
    private double salary;
    private String[] subjects;

    public Staff() {
        super();
        this.salary = 0.0;
        this.subjects = new String[0];
    }

    public Staff(int id, String login, String password, String name, String surname, double salary, String[] subjects) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String getData() {
        StringBuilder subjectsString = new StringBuilder();
        for (String subject : subjects) {
            subjectsString.append(subject).append(" ");
        }
        return super.getData() + ", Salary: " + salary + ", Subjects: " + subjectsString.toString().trim();
    }
}