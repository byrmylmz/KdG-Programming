package Week1;

import java.util.Scanner;

public class Ex0104 {

    public static void main(String[] arg){

        String firstName;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");

        firstName=keyboard.nextLine();

        System.out.println("Welcome " + firstName);

        keyboard.close();

    }
}
