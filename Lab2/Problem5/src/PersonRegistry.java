import java.util.ArrayList;
import java.util.List;

public class PersonRegistry{
    private List<Person> people;

    public PersonRegistry(){
        people = new ArrayList<>();
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public void removePerson(Person person){
        people.remove(person);
    }

    public List<Person> findPeopleWithPets(){
        List<Person> result = new ArrayList<>();
        for (Person person : people){
            if (person.hasPet()){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeopleWithooutPets(){
        List<Person> result = new ArrayList<>();
        for (Person person : people){
            if (!person.hasPet()){
                result.add(person);
            }
        }
        return result;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Person person : people){
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}
