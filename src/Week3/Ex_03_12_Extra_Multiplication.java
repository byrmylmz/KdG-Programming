package Week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_03_12_Extra_Multiplication {
    public static void main(String[] args) {
        int number = 0;
        boolean inputError;
        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.println("Enter a number between 1 and 30:");
            inputError=false;
           try{
               number = keyboard.nextInt();
               if(number<1 || number>30){
                   inputError=true;
               }

           } catch(InputMismatchException e){
               inputError=true;
               keyboard.nextLine();
           }

        }while(inputError);


        for (int i = 1; i <= number; i++) {
//            System.out.print(i);
            for (int j = 1; j <= number; j++) {
                System.out.printf("|%3d%s", i * j, (j == number ? "|\n" : ""));

            }

        }

    }
}
