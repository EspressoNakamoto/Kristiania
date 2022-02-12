import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public BookRegister register;

    // Constructor
    public Program() {
        this.register = new BookRegister();
        ArrayList <Book> books = readBooks("resources/bok.txt");

        for (Book book : books) {
            register.registerBooks(book);
        }
    }

    public void programStart() {

        displayMenu();
        
        Scanner userInput = new Scanner(System.in);
        String input = "0";

        while (!input.equals("8")) {
            input = userInput.nextLine();
            switch (input) {
                case "0":
                    displayMenu();
                    break;

                case "1": 
                    for (Book b : register.registeredBooks()) {
                        System.out.println(b.toString());
                    }
                    break;
            
                case "2":
                    System.out.println("Add a book");
                    Book newBook = newBook(userInput);
                    break;
                default:
                    break;
            }
        }
    
        userInput.close();
    }

    public Book newBook(Scanner sc) {
        System.out.println("New book:");
        System.out.println("Title: ");
        String title = sc.nextLine();

        System.out.println("Author: ");
        String author = sc.nextLine();

        System.out.println("ISBN: ");
        String isbn = sc.nextLine();


        
        Book b = new Book();
    }

    public ArrayList<Book> readBooks(String file) {

        ArrayList<Book> listOfBooks = new ArrayList<>();

        try {
            File getFile = new File(file);
            Scanner readBooks = new Scanner(getFile);
            
            while (readBooks.hasNextLine()) {
                String isbn = readBooks.nextLine();
                String title = readBooks.nextLine();
                String author = readBooks.nextLine();

                String pages = readBooks.nextLine();
                int pagesToInt = Integer.parseInt(pages);

                String genre = readBooks.nextLine();
                Genre stringToGenre = parseGenre(genre);

                Book books = new Book(title, author, pagesToInt, stringToGenre, isbn);
                listOfBooks.add(books);

                readBooks.nextLine();
            }

            readBooks.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        return listOfBooks;
    }

    public void displayMenu() {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Display Menu");
        menu.add("Overview of all books");
        menu.add("Add a book");
        menu.add("Modify a book");
        menu.add("Find based on Genre");
        menu.add("Find based on author");
        menu.add("Find based on ISBN");
        menu.add("Remove a book");
        menu.add("Exit");

        for (int i = 0; i < menu.size(); i++){
            System.out.println(i + ". " + menu.get(i));
        }
    }

    public Genre parseGenre(String genre) {
        return switch (genre) {
            case "CRIME" -> Genre.CRIME;
            case "ACTION" -> Genre.ACTION;
            case "FANTASY" -> Genre.FANTASY;
            case "CLASSIC" -> Genre.CLASSIC;
            case "SCIFI" -> Genre.SCIFI;
            default -> Genre.OTHER;
        };
    }
}
