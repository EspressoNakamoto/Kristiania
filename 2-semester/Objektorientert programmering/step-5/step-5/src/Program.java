import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public void problem4() {
        try {
            File opg4 = new File("src/files_step5/opg4.txt");
            Scanner readFile = new Scanner(opg4);
            while (readFile.hasNextLine()) {
                String data = readFile.nextLine();
                System.out.println(data);
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
