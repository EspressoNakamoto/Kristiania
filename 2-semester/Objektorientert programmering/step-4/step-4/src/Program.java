import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void runProgram() {
        System.out.println("Program starting");
    }

    public void task4() {
        // Scanner takes input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Type 3 strings");
        ArrayList<String> inputArray = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            inputArray.add(input.next());

        }
        // input.close();

        // Prints arraylist
        System.out.println();
        System.out.println("Output:");
        for (String string : inputArray) {
            System.out.println(string);
        }
    }

    public void task6() {
        System.out.println("Enter a number to add and end with a negative number");
        Scanner input = new Scanner(System.in);

        int inputs = input.nextInt();
        int sum = 0;

        while (inputs >= 0) {
            sum += inputs;
            inputs = input.nextInt();
        }

        System.out.println("Sum: " + sum);
    }

    public void task7() {
        ArrayList<String> arrayWords = new ArrayList<String>();
        
        class run {
            public void initiate() {
                System.out.println();
                System.out.println("Select:");
                System.out.println("1. Add a single word");
                System.out.println("2. Display all words");
                System.out.println("3. End");
                
                try (Scanner input = new Scanner(System.in)) {
                    int userInput = input.nextInt();
                    
                    if (userInput == 1) {
                        new run().addWord();
                    } else if (userInput == 2){
                        new run().displayWords();
                    } else if (userInput == 3) {
                        new run().end();
                    }
                }
            }
            
            public void addWord() {
                System.out.println();
                System.out.println("Add a word");
                Scanner input = new Scanner(System.in);
                String userInput = input.nextLine();
                arrayWords.add(userInput);
                initiate();
            }
            
            public void displayWords() {
                System.out.println();
                System.out.println(arrayWords);
                initiate();
            }
            
            public void end() {
                System.out.println();
                System.out.println("Goodbye :)");
            }
        }

        new run().initiate();
    }
}