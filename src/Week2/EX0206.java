package Week2;

import java.util.Scanner;

public class EX0206 {

    public static void main(String[] arg) {

        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number between 32 and 127");
        number = keyboard.nextInt();

        if (number < 32 || number > 127) {
            System.out.println("invalid number");

        } else {
            char letter = (char) number;
            System.out.println(letter);
        }


        //with loop

        for (int i = 32; i <= 127; i++) {
            char letter = (char) i;
            System.out.println(letter + " ( " + i + " )");
        }

        //second loop


        for (int j=128; j<=255; j++){
            char letter = (char) j;
            System.out.println(letter + " ( " + j + " )");
        }

    }
}
