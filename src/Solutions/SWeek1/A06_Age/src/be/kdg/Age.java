package Solutions.SWeek1.A06_Age.src.be.kdg;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Author: derijkej
 */
public class Age {
	public static void main(String[] args) {
		//declaraties:
		String name;
		int birthYear;
		int currentYear;
		int age;
		Scanner keyboard = new Scanner(System.in);

		//algorithm:
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Dear " + name + ", please enter the year you were born: ");
		birthYear = keyboard.nextInt();
		//get current year from systemtime:
		currentYear = LocalDate.now().getYear();
		//Calculate and display:
		age = currentYear - birthYear;
		System.out.println("If all goes well you'll be  " + age + " by the end of the year.");
	}
}
