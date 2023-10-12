package Week3;

import java.util.Scanner;

public class Ex_03_04_Multiples {
    public static void main(String[] arg){
        int MAX=100;
        int numberKey;
        int factor=0;
        int result=0;
        System.out.println("Give number");
        Scanner keyboard = new Scanner(System.in);
        numberKey =keyboard.nextInt();

        while(result<MAX){
            factor++;
            result = numberKey*factor;
            if(result >100){continue;}
            System.out.println(result);

        }



    }
}
