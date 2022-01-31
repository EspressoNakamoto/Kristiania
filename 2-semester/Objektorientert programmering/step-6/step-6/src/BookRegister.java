import java.util.ArrayList;

public class BookRegister {
    private ArrayList<Book> books;
    private int numberOfBooks;

    // Constructor
    public BookRegister() {
        this.books = new ArrayList<>();
        this.numberOfBooks = 0;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void registerBooks(Book book) {
        this.books.add(book);
    }

    public void test() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
