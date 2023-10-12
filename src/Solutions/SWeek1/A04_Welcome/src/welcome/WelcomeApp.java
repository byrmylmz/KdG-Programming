package Solutions.SWeek1.A04_Welcome.src.welcome;

import java.util.Scanner;

/**
 * Author: derijkej
 */
public class WelcomeApp {
	public static void main(String[] args) {
		int sum;
		int first;
		int second;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		System.out.print("Welcome " + keyboard.nextLine() + "!");
	}
}
