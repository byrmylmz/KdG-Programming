package Week5.ex01book;

public class Book {
    private String author;
    private String title;
    private int pages;
    private boolean onLoan;

    public Book(String auteur, String title, int pages) {
        this.author = auteur;
        this.title = title;
        this.pages = pages;
    }

    public Book() {
        this("onbekend", "onbekend", 0);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public String toString() {
        return "Book " + title.toUpperCase()
                + "(" + pages + " pages), written by " + author.toUpperCase()
                + " is  " + (onLoan ? "on loan." : "available.");
    }
}

