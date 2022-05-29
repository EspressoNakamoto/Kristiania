import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        // Test
        System.out.println("Hello, World!");

        // Program
        Program program = new Program();
        program.runProgram();
        program.getSamplePerson("Jarl");
        program.addTenPeopleToHashSet();

        // Print people over age of 20 from HashSet
        Set<Person> personsOver = program.getPersonsOverAge(20);
        personsOver.forEach(System.out::println);
    }
}
