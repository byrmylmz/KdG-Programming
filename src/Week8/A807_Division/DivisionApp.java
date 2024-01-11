package Week8.A807_Division;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {



        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("number a:");
            int a = keyboard.nextInt();
            System.out.println("number b:");
            int b = keyboard.nextInt();

            System.out.println(a/b);
        }catch (ArithmeticException exc){
            System.out.println("Can not divided "+exc.getMessage());
        }

    }

}
