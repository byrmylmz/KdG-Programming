package Week8;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Boiler {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.print("Please enter an integer: ");
//            int number = scanner.nextInt();
//        } catch (InputMismatchException exc) {
//            System.out.println("That's not a valid integer!");
//            System.out.println(exc.getMessage());
//        }
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check =false;
        do{

            try {
                System.out.print("Please enter an integer: ");
                int number = scanner.nextInt();
                check=false;
                System.out.println("Secilan number "+number);
            } catch (InputMismatchException exc) {
                check=true;
                System.out.println("That's not a valid integer!");
                scanner.nextLine();
            }

        }while(check);
    }
}
