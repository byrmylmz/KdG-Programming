package Solutions.SWeek2.A11_scramble_name.src.be.kdg.java1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    Enter your name: Lars Willemsens
    Hi Lars Willemsens, your scrambled name is snraeissWLmell.
    */
    /*
    Enter your name: Jan de Rijke
    Hi Jan de Rijke, your scrambled name is iRanjJedek.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random is something we will see later.
        Random random = new Random();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String nameCopy = new String(name);
        String scrambledName = "";
        //These are methods of String we have not learned about yet.
        while (!nameCopy.isEmpty()) {
            //Usage of random.
            int charPosition = random.nextInt(nameCopy.length());
            //Advanced usage of Strings, getting a single character out.
            char c = nameCopy.charAt(charPosition);
            if (c != ' ') {
                scrambledName += c;
            }
            //Substring is something we will learn about later as well.
            nameCopy = nameCopy.substring(0, charPosition) + nameCopy.substring(charPosition + 1);
        }
        System.out.printf("Hi %s, your scrambled name is %s.", name, scrambledName);
    }
}
