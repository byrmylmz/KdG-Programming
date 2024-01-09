package Week8;

public class Book implements Printable{
    int age;
    @Override
    public void print() {
        System.out.println("Book");
    }
}
