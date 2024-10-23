public class PhDStudent extends Student {
    private String major;
    private String researchArea;

    public PhDStudent(String name, int age, String major, String researchArea) {
        super(name, age);
        this.major = major;
        this.researchArea = researchArea;
    }

    public String getOccupation() {
        return "PhDStudent: (Major: " + major + ", Research Area: " + researchArea + ")";
    }
}
