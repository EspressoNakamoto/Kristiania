public class book {
    private String title;
    private String author;
    private int pages;
    private genre genre;
    private String isbn;

    public book(String title, String author, int pages, genre genre, String isbn) {
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

    public genre getGenre() {
        return genre;
    }

    public void setGenre(genre genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
