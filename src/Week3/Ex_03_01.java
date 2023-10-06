package Week3;

import java.util.Scanner;

public class Ex_03_01
{

    public static void main(String[] args){
        int age;
        Scanner key = new Scanner(System.in);
        age = key.nextInt();

        if(age<2 ){
            System.out.println("Baby");
        } else if (age>2 && age<12) {
            System.out.println("Child");
        }else if(age>13 && age<17){
            System.out.println("teenager");
        }else if(age>18){
            System.out.print("Adult");
        }


    }
}
