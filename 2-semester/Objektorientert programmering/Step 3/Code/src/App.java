public class App {
    private static class book {
        static String title;
        static String author;
        static int numberOfPages;

        static book printOut() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Number of pages: " + numberOfPages);
            System.out.println("Genre: " + genres.ACTION);
            System.out.println();
            return null;
        }

        static private book insBook() {
            title = "The Reckoning";
            author = "Me";
            numberOfPages = 300;
            return null;
        }
        static book setMethod(String newTitle, String newAuthor, int newNumber) {
            book.title = newTitle;
            book.author = newAuthor;
            book.numberOfPages = newNumber;
            return null;
        }
    }


    public static void main(String[] args) {
        book.insBook();
        book.printOut();

        book.setMethod("Testing", "Mr. Testing", 500);

        book.printOut();
    }
}
