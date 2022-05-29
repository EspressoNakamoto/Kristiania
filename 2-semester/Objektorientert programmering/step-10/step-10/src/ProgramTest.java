import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ProgramTest {
    @Test
    void testAddPerson() {
        Program test = new Program();
        test.runProgram();

        for (Person iterable_element : test.persons) {
            if (iterable_element.getName() == "Jarl") {
                assertEquals(iterable_element, test.getSamplePerson("Jarl").get());
            }
        }
    }

    @Test()
    void testGetSamplePerson() {
        Program test = new Program();
        test.runProgram();

        try {
            test.addPerson(new Person(25, "Jonas"));
        } catch (IllegalArgumentException e) {
            fail(e);
        }
    }
}
