package Week5.Ex_05_01_BookClass;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("JAVA");
        book.setAuthor("DEITEL & DEITEL");
        book.setPages(1886);
        book.setOnLoan(true);

        System.out.println( book.toString());

    }
}
