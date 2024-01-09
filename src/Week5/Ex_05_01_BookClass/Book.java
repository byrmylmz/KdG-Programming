package Week5.Ex_05_01_BookClass;

/**
 *
 */
public class Book {
    private String author;
    private String title;
    private int pages;
    private boolean onLoan;


    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;

    }

    public Book() {this("unknown","unknown",0);}



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    @Override
    public String toString() {
        return "Ex_05_01_BookClass{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", onLoan=" + onLoan +
                '}';
    }

    public String toString2() {
        return author + "test";
    }


}
