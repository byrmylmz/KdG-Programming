package Solutions.SWeek3.ex03_01_age;

import java.util.Scanner;

public class AgeApp {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = keyboard.nextInt();
        
        if (age < 2) {
            System.out.println("Hey Baby!");
        } else if (age < 13) {
            System.out.println("Chill child!");
        } else if (age < 18) {
            System.out.println("Top Teenager!");
        } else {
            System.out.println("Act like an adult!");
        }
    }  // main()
    
}  // class
