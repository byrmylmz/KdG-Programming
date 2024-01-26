package Week5.ex01book;

public class TestBook {
	public static void main(String[] args) {
		Book b1 = new Book("Deitel & Deitel", "Java, How to program,", 1186);
		Book b2 = new Book("Hillary Mantel", "Wolf Hall", 604);
		Book b3 = new Book("P.G. Wodehouse", "Leave it to Psmith", 352);

		b1.setOnLoan(true);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		b3.setOnLoan(true);
		System.out.println(b3.toString());
	}
}
