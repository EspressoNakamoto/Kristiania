import java.util.HashSet;

public class Program {

    public void runProgram() {
        Person person = new Person(20, "Anton");
        System.out.println(person);

        HashSet<Person> persons = new HashSet<>();

        Person p1 = new Person(20, "Jarl");
        Person p2 = new Person(20, "Jarl");

        persons.add(p1);
        persons.add(p2);

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
