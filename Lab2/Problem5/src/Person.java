import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet){
        if (this instanceof PhDRtudent && pet instanceof Dog){
            System.out.println("PhDRtudent cannot have Dog");
        } else {
            this.pet = pet;
        }
    }

    public void removePet(){
        this.pet = null;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public abstract String getOccuppation();

    public Animal getPet(){
        return pet;
    }

    public String toString() {
        return name + " ("
                + getOccuppation()
                + ", age: " + age
                + ") " + (hasPet() ? ", pet: " + pet : ", no pet");
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void leavePetWith(Person other){
        if (!this.hasPet()) {
            System.out.println(this.name + " does not have a pet");
            return;
        }

        if (other instanceof PhDStudent && this.pet instanceof Dog){
            System.out.println("PhDRtudent cannot have Dog");
            return;
        }

        other.assignPet(this.pet);
        this.removePet();
        System.out.println(this.name + " has left the pet with " + other.name);
    }

    public void retrievePetFrom(Person other){
        if (other.hasPet() && other.getPet().equals(this.pet)){
            this.assignPet(other.getPet());
            other.removePet();
            System.out.println(this.name + " has retrieved the pet from " + other.name);
        } else {
            System.out.println(this.name + " has no a pet to retrive from " + other.name);
        }
    }
}
