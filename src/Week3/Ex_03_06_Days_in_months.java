package Week3;

import java.util.Scanner;

public class Ex_03_06_Days_in_months {
    public static void main(String[] arg) {

        int numberOfMonth;
        int numberOfYear;
        System.out.println("Number of Month");
        Scanner keyboard = new Scanner(System.in);
        numberOfMonth = keyboard.nextInt();
        System.out.println("Number of year");
        numberOfYear = keyboard.nextInt();

        switch (numberOfMonth) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The number of days :30");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println("The number of days :31");
            case 2:
                if (numberOfYear % 4 != 0) {
                    System.out.println("The number of days: 28");
                } else {
                    System.out.println("the number of days: 29");
                }
                break;
            default:
                System.out.println("invalid number");
        }


//        switch(1){
//            case 1 :
//                System.out.println("1"); break;
//            default:
//                System.out.println("default");
//        }


    }
}
