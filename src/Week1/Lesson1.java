package Week1;

import java.util.Scanner;

public class Lesson1 {


    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String first,second;

        System.out.println("arg1");
        first = sc.nextLine();

        System.out.println("arg2");
        second = sc.nextLine();

       for(int i=0; i<arg.length; i++){
           System.out.println(arg[i]);
       }

    }
}
