package Solutions.SWeek3.ex03_06_daysinmonth;

import java.util.Scanner;

public class DaysInMonthApp {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a month number (1 = January): ");
        int month = keyboard.nextInt();
        
        String monthName;
        int days;
        switch (month) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                days = 28;
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Wrong month number");
                monthName = "invalid";
                days = 0;
        }  // switch
        
        if (days > 0) {
            System.out.println(monthName + " has " + days + " days.");
        }  // if
        
    }  // main()
    
}  // class
