public class Book {
    private String title;
    private String author;
    private int pages;
    private Genre genre;
    private String isbn;

    public Book(String title, String author, int pages, Genre genre, String isbn) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString(){
        return "" + author + " - " + title + ", " + genre + ", " + isbn + "; ";
    }
}
