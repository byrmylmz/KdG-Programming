package Week2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Ex_02_11_Scramble_name_Extra {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String name;
        String nameCopy;
        String scrambledName = "";

        System.out.println("enter youn name");
        name = sc.nextLine();
        nameCopy = name;

        while (!nameCopy.isEmpty()) {
            int charPosition = random.nextInt(nameCopy.length());
            char c = nameCopy.charAt(charPosition);
            if (c != ' ') {
                scrambledName += c;
            }
            nameCopy = nameCopy.substring(0,charPosition) + nameCopy.substring(charPosition+1);

        }
        System.out.printf("Hi %s, your scrambled name is %s.", name, scrambledName);

    }
}
