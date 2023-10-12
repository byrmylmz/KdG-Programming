package Solutions.SWeek2.A03_taxes.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    /*
    Enter the VAT percentage: 21
    Enter an amount in €: 121
    Make a choice (1 = inclusive, 2 = exclusive): 1
    €100.0 + 21.0% VAT = €121.0

    Enter the VAT percentage: 6
    Enter an amount in €: 100
    Make a choice (1 = inclusive, 2 = exclusive): 2
    €100.0 + 6.0% VAT = €106.0

    Enter the VAT percentage: 12
    Enter an amount in €: 100
    Make a choice (1 = inclusive, 2 = exclusive): 3
    Invalid choice!
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float vatPercentage;
        float amount;
        int choice;

        System.out.print("Enter the VAT percentage: ");
        vatPercentage = keyboard.nextFloat();
        System.out.print("Enter an amount in €: ");
        amount = keyboard.nextFloat();
        System.out.print("Make a choice (1 = inclusive, 2 = exclusive): ");
        choice = keyboard.nextInt();

        float incl;
        float excl;
        if (choice == 1) {
            incl = amount;
            excl = incl * (100 / (100 + vatPercentage));
            System.out.printf("€%.1f + %.1f%% VAT = €%.1f\n", excl, vatPercentage, incl);
        } else if (choice == 2) {
            excl = amount;
            incl = excl * (1 + vatPercentage / 100);
            System.out.printf("€%.1f + %.1f%% VAT = €%.1f\n", excl, vatPercentage, incl);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
