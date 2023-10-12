package Solutions.SWeek3.ex03_02_scrabble;

import java.util.Scanner;

public class ScrabbleApp {
    
    public static void main(String[] args) {
        System.out.print("Please enter a letter: ");
        Scanner keyboard = new Scanner(System.in);
        String letter = keyboard.nextLine();
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "l":
            case "n":
            case "s":
            case "t":
            case "r":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "L":
            case "N":
            case "S":
            case "T":
            case "R":
                System.out.println("1 point");
                break;
            case "d":
            case "g":
            case "D":
            case "G":
                System.out.println("2 points");
                break;
            case "b":
            case "c":
            case "m":
            case "p":
            case "B":
            case "C":
            case "M":
            case "P":
                System.out.println("3 points");
                break;
            case "f":
            case "h":
            case "v":
            case "w":
            case "y":
            case "F":
            case "H":
            case "V":
            case "W":
            case "Y":
                System.out.println("4 points");
                break;
            case "k":
            case "K":
                System.out.println("5 points");
                break;
            case "j":
            case "x":
            case "J":
            case "X":
                System.out.println("8 points");
                break;
            case "q":
            case "z":
            case "Q":
            case "Z":
                System.out.println("10 points");
                break;
            default:
                System.out.println("Invalid letter");
        }  // switch
    }  // main()
    
}  // class
