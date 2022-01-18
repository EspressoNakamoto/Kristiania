import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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

    public void task5() {
        try {
            FileWriter writeToFile = new FileWriter("src/files_step5/opg5.txt");
            Scanner userInputObject = new Scanner(System.in);
            System.out.println("Type in 5 strings");
            for (int i = 0; i < 5; i++) {
                String userInpuString = userInputObject.nextLine();
                writeToFile.write(userInpuString);
                if (i < 4) {
                    writeToFile.write("\n");
                }
            }
            writeToFile.close();
            userInputObject.close();
            System.out.println("Write successful");
        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
