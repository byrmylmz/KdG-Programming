package Solutions.SWeek1.A05_Product.src.calculate;

import java.util.Scanner;

/**
 * Author: derijkej
 */
public class ProductApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Input:
		System.out.print("Enter a number: ");
		int first = scanner.nextInt();
		System.out.print("Enter another number: ");
		int second = scanner.nextInt();
		System.out.print("Enter a final number: ");
		int third = scanner.nextInt();
		//Berekening en output:
		int product = first * second * third;
		System.out.println("The product is " + product);
	}
}
