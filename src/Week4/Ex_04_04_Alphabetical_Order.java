package Week4;

import java.util.Scanner;

public class Ex_04_04_Alphabetical_Order {
    public static void main(String[] args) {
        String firstLine;
        String secondLine;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text: ");
        firstLine = input.nextLine().strip() ;

        System.out.println("Enter another text: ");
        secondLine = input.nextLine().strip();

        if(firstLine.compareTo(secondLine)>0){

            String temp = firstLine;
            firstLine=secondLine;
            secondLine=temp;

        }
        System.out.println(firstLine + " " + secondLine);



    }
}
