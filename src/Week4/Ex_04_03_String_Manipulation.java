package Week4;

import java.util.Scanner;

public class Ex_04_03_String_Manipulation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sentence;
        System.out.print("Please enter a sentence");
        sentence = keyboard.next();

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.replace("a", "o"));
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length() - 1));
        System.out.println(sentence.length() - sentence.replace("e", "").length());

        int eCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'e') {
                eCount++;
            }



        }
        System.out.println("e :"+eCount);


    }
}
