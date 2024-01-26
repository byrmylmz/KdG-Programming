package Week5.ex02bankaccount;

public class DemoBankAccount {
	public static void main(String[] args) {
		BankAccount greg = new BankAccount("Gregory Persons", "BE15 6474 3001 5840");
		System.out.println(greg);
		greg.deposit(3000);
		System.out.println(greg);
		if (greg.withdraw(2000)) {
			// opname geeft true terug
			System.out.println(greg);
		} else {
			System.out.println("Insufficient credit");
		}
		if (greg.withdraw(1500)) {
			// opname geeft false terug
			System.out.println(greg);
		} else {
			System.out.println("Insufficient credit");
		}
		BankAccount carl = new BankAccount("Carl Deleu", "BE45 8477 0157 5478", 35652);
		System.out.println("\n" + carl);
		carl.deposit(6487);
		System.out.println(carl);
	}
	/* TODO: write the BankAccount class so that this output is produced by running this program
		The account BE15 6474 3001 5840 of Gregory Persons has a balance of € 0,00
		The account BE15 6474 3001 5840 of Gregory Persons has a balance of € 3000,00
		The account BE15 6474 3001 5840 of Gregory Persons has a balance of € 1000,00
		Insufficient credit

		The account BE45 8477 0157 5478 of Carl Deleu has a balance of € 35652,00
		The account BE45 8477 0157 5478 of Carl Deleu has a balance of € 42139,00
     */
}