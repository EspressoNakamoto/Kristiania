import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
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

    public void task7() {
        try {
            File opg7 = new File("src/files_step5/opg7.txt");
            Scanner getArtist = new Scanner(opg7);
            while (getArtist.hasNextLine()) {
                String artistName = "";
                String date = "";
                String cityName = "";
                String countryName = "";
                if (getArtist.findInLine("---") != "---") {
                    
                    int lineCounter = 1;
                    for (int i = 0; i < lineCounter; i++) {
                        if (getArtist.findInLine("---") != "---") {
                            String data = getArtist.nextLine();
                            switch (i) {
                                case 0:
                                artistName = data;
                                break;
                                case 1:
                                date = data;
                                break;
                                case 2:
                                cityName = data;
                                break;
                                case 3:
                                countryName = data;
                                break;
                                
                                default:
                                break;
                            }
                        }
                        if (lineCounter < 4) {
                            lineCounter ++;
                        }
                    }
                }
                DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
                LocalDate stringToDate = LocalDate.parse(date, dFormatter);
                new Artist(artistName, stringToDate, cityName, countryName).printObject();
                System.out.println();
                getArtist.nextLine();
            }
            getArtist.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }

    public void task8() {
        try {
            File opg8 = new File("src/files_step5/opg7.txt");
            Scanner getArtist = new Scanner(opg8);

            ArrayList<String> artistData = new ArrayList<String>();

            while (getArtist.hasNextLine()) {
                String data = getArtist.nextLine();
                artistData.add(data);
            }
            getArtist.close();

            for (String string : artistData) {
                System.out.println(string);
            }

            System.out.println("Replace lines that includes:");
            Scanner input = new Scanner(System.in);
            String userInput = input.next();

            for (int i = 0; i < artistData.size(); i++) {
                if (artistData.get(i).contains(userInput)) {
                    System.out.println("New line");
                    String newLine = input.next();
                    String replaceLine = artistData.get(i);

                    replaceLine.replace(userInput, newLine);

                    artistData.set(i, newLine);
                }
            }
            input.close();

            try {
                File opg8New = new File("src/files_step5/opg8.txt");
                Scanner opg8Scan = new Scanner(opg8New);
                FileWriter writer = new FileWriter(opg8New);
                
                for (String string : artistData) {
                    writer.write(string + "\n");
                }
                opg8Scan.close();
                writer.close();
            } catch (Exception e) {
                System.out.println("And error has occured");
                e.printStackTrace();
            }

            for (String stringOut : artistData) {
                System.out.println(stringOut);
            }

        } catch (Exception e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
