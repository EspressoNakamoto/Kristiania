
// Imports
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Program {
    // HashSet to keep Person objects
    HashSet<Person> persons = new HashSet<>();

    // Initial program
    public void runProgram() {
        // New object and sysout to test
        Person person = new Person(20, "Anton");
        System.out.println(person);

        // 2 objects with same values
        Person p1 = new Person(20, "Jarl");
        Person p2 = new Person(20, "Jarl");

        // Add the objects with similar values to the HashSet
        persons.add(p1);
        persons.add(p2);

        // For-loop to print all objects in the HashSet
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    /*
     * Returns object if same name.
     * Use of Optional for not returning null when not same name
     */
    public Optional<Person> getSamplePerson(String name) {
        for (Person personObject : persons) {
            if (personObject.getName().equalsIgnoreCase(name)) {
                return Optional.of(personObject);
            }
        }
        return Optional.empty();
    }

    // Method to add object to HashSet
    public void addPerson(Person p) {
        validatePerson(p);
        persons.add(p);
    }

    // Method to validate if new object and name is not null and age is positive
    public void validatePerson(Person p) {
        if (p == null) {
            throw new IllegalArgumentException("Null when Person expected");
        }

        if (p.getAge() < 0) {
            throw new IllegalArgumentException("Age negative value, age has to be of positive value");
        }

        if (p.getName() == null) {
            throw new IllegalArgumentException("Null when String expected");
        }
    }

    // Method to add 10 random people
    public void addTenPeopleToHashSet() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Colin Ayala");
        names.add("Remington Perry");
        names.add("Jace Lamb");
        names.add("Kaleb Gardner");
        names.add("Abram Richard");
        names.add("Damon Giles");
        names.add("Janiya Garner");
        names.add("Reid Salazar");
        names.add("Brandon Cabrera");
        names.add("Victor Thomas");

        for (int i = 0; i < 10; i++) {
            persons.add(new Person((int) (Math.random() * 50), names.get(i)));
        }
    }

    // Method to return Set of Person ojbects over given age
    public Set<Person> getPersonsOverAge(int age) {
        Set<Person> returnPersons = new HashSet<>();

        for (Person person : persons) {
            if (person.getAge() > age) {
                returnPersons.add(person);
            }
        }

        return returnPersons;
    }
}
