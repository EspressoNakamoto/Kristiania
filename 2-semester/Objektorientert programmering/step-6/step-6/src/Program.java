import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void programStart() {
        displayMenu();
        
        Scanner menuInput = new Scanner(System.in);
        menuInput.nextInt();
    
        menuInput.close();
    }

    public void displayMenu() {
        ArrayList<String> menu = new ArrayList<>();
        menu.add(0, "Display Menu");
        menu.add(1, "Overview of all books");
        menu.add(2, "Add a book");
        menu.add(3, "Modify a book");
        menu.add(4, "Find based on Genre");
        menu.add(5, "Find based on author");
        menu.add(6, "Find based on ISBN");
        menu.add(7, "Remove a book");
        menu.add(8, "Exit");

        for (int i = 0; i < menu.size(); i++){
            System.out.println(i + ". " + menu.get(i));
        }
    }
}
