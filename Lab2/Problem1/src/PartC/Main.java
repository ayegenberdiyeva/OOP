package PartC;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();

        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Employee emp1 = new Employee("Bob", 25, "E001");
        Employee emp2 = new Employee("Bob", 25, "E001");

        people.add(person1);
        people.add(person2);
        people.add(emp1);
        people.add(emp2);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
