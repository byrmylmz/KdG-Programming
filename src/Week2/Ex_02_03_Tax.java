package Week2;


import java.util.Scanner;

public class Ex_02_03_Tax {

    public static void main(String[] arg) {
        double vat;
        double amount;
        int choice;

        System.out.println("Enter the VAT percentage");

        Scanner keyboard = new Scanner(System.in);

        vat = keyboard.nextDouble();

        System.out.println("Enter an amount in €:");

        amount = keyboard.nextDouble();

        System.out.println("Make a choice (1 = inclusive, 2 = exclusive):");

        choice = keyboard.nextInt();

        if (choice == 1) {
            System.out.println("€" + (amount / (vat / 100 + 1)) + " + " + vat + "% VAT = €" + amount);

        } else if (choice == 2) {
            System.out.println("€" + amount + " + " + vat + "% VAT = €" + (amount + (amount * vat / 100)));

        } else {
            System.out.println("Invalid Choice!");

        }

        keyboard.close();

    }
}

