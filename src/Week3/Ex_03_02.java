package Week3;

import java.util.Scanner;

public class Ex_03_02 {

    public static void main(String[] arg){
        String letter;


        Scanner keyboard = new Scanner(System.in) ;

        Boolean play =true;

        while(play){
            System.out.println("Guess the letter");
            letter = keyboard.nextLine();
            String letterUpper=letter.toUpperCase();
            switch (letterUpper) {
                case "A", "E", "I", "O", "U", "L", "N", "S", "T", "R" -> {
                    System.out.println("Your point 1");
                }

                case "D", "G" -> System.out.println("Your point 2");
                case "B", "C", "M", "P" -> System.out.println("Your point 3");
                case "F", "H", "V", "W", "Y" -> System.out.println("Your point 4");
                case "K" -> System.out.println("Your point 5");
                case "J", "X" -> System.out.println("Your point 8");
                case "Q", "Z" -> System.out.println("Your point 10");
                case "0"-> {
                    System.out.println("program willbe exit");
                    play=false;
                }
                default -> System.out.println("invalid");

            }

        }




    }
}
