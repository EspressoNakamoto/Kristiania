public class App {
    public static void main(String[] args) throws Exception {
        // Test
        System.out.println("Hello, World!");

        // Program
        Program program = new Program();
        program.runProgram();
        program.getSamplePerson("Jarl");

        try {
            program.addPerson(new Person(25, "test"));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("fail");
        }
    }
}
