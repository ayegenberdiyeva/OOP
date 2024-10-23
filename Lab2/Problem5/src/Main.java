public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("--- Initial Registry ---");
        System.out.println(registry);

        john.leavePetWith(alice);
        System.out.println("--- After John Leaves Pet with Alice ---");
        System.out.println(registry);
        s
        john.retrievePetFrom(alice);
        System.out.println("--- After John Retrieves Pet from Alice ---");
        System.out.println(registry);
    }
}