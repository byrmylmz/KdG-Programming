package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_03_13_Extra_Quiz {
    public static void main(String[] args) {
        int number;
        int calculation=1;
        Scanner keyboard = new Scanner(System.in);
        int result;
        ArrayList<String> wrong = new ArrayList<String>();


        do {
            System.out.println("Which multiplication table would you like to see? ");
            number = keyboard.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "x" + number + "=");
                result = keyboard.nextInt();
                if (result == number * i) {
                    System.out.println("correct");
                }else{
                    System.out.println("wrong");
                    wrong.add("wrong answer for " +i + "x" + number + "=" );
                }
            }
            calculation +=1;


        } while (calculation <=10);

        System.out.println(wrong);
    }
}
