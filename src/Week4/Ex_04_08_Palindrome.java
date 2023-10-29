package Week4;

import java.util.Scanner;

public class Ex_04_08_Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a word");
        String word = keyboard.next();

        StringBuilder input = new StringBuilder(word);
        StringBuilder rInput = new StringBuilder(word).reverse();

        System.out.println(input);
        System.out.println(rInput);
        if(input.compareTo(rInput) == 0){
            System.out.println("equel");
        }
    }
}
