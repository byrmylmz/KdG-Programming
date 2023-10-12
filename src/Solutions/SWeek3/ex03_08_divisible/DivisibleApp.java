package Solutions.SWeek3.ex03_08_divisible;

import java.util.Scanner;

public class DivisibleApp {
    public static void main(String[] args) {
        final int MAX = 1000;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("We'll print all numbers below 1000 that are divisible between 2 numbers of your choosing.");
        
        boolean stop = false;
        do {
            System.out.print("\nEnter the first divider (end the program with 0): ");
            int first = keyboard.nextInt();
            int second = 0;
            
            if (first > 0) {
                System.out.print("Enter the second divider: ");
                second = keyboard.nextInt();
                if (second > 0) {
                    int count = 0;
                    for (int number = 1; number < MAX; number++) {
                        if (number % first == 0 && number % second == 0) {
                            System.out.print(number + " ");
                            if (++count % 10 == 0) {
                                System.out.println();
                                count = 0;
                            }
                        }
                    }
                    System.out.println();
                }
            }
            if ((first < 0) || (second < 0)) {
                System.out.println("Please enter positive numbers");
            } else if ((first == 0) || (second == 0)) {
                stop = true;
            }
        } while (!stop);
    }  // main()
    
}  // class