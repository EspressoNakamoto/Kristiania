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

    public ArrayList<Book> registeredBooks(){
        ArrayList<Book> result = new ArrayList<>();
        for(Book b : this.books){
            result.add(b);
        }
        return result;
    }
}
