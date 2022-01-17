import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void runProgram() {
        System.out.println("Program starting");
    }

    public void task4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type 3 strings");
        String userInputOne = input.nextLine();
        String userInputTwo = input.nextLine();
        String userInputThree = input.nextLine();
        input.close();

        ArrayList<String> inputArray = new ArrayList<String>();
        inputArray.add(userInputOne);
        inputArray.add(userInputTwo);
        inputArray.add(userInputThree);

        System.out.println(inputArray);
    }

    public void name() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to add and end with a negative number");
        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        Boolean positive = true;
        while (positive == true) {
            int userInput = input.nextInt();
            if (userInput >= 0) {
                inputArray.add(userInput);
            } else {
                input.close();
                positive = false;
                int sum = 0;
                for (Integer integer : inputArray) {
                    sum += integer;
                }
                System.out.println("Sum: " + sum);
            }
        }
    }

    public void task7() {
        System.out.println("Select:");
        System.out.println("1. Add a single word");
        System.out.println("2. Display all words");
        System.out.println("3. End");

        ArrayList<String> arrayWords = new ArrayList<String>();
        
        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();

        class run {
            
            public void addWord() {
                System.out.println();
                System.out.println("Add a word");
                
                String userInput = input.nextLine();
                arrayWords.add(userInput);
                task7();
            }
            
            public void displayWords() {
                
            }
            
            public void end() {
                
            }
        }
        
        if (userInput == 1) {
            new run().addWord();
        } else if (userInput == 2){
            new run().displayWords();
        } else if (userInput == 3) {
            new run().end();
        }
        input.close();
    }
}