package Solutions.SWeek3.ex03_04_multiples;

import java.util.Scanner;

public class MultiplesApp {
    
    public static void main(String[] args) {
        final int MAX = 100;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Which number would you like to see the multiples of? ");
        int basis = keyboard.nextInt();
        int multiple = basis;
        while (multiple < MAX) {
            System.out.println(multiple);
            multiple += basis;
        }  // while
    }  // main()
    
}  // class
