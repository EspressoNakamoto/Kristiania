public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("------------");

        Program p = new Program();
        p.createCircle();
        p.createRectangle();
        p.createSquares();
        p.listShapes();
    }
}