package Week4;

import java.util.Random;
import java.util.Scanner;

public class Ex_04_07_StringBuilder {
    public static void main(String[] args) {
        System.out.print("Enter your first name and last name, separated by a space: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        StringBuilder builderOne = new StringBuilder();
        StringBuilder builderTwo = new StringBuilder(name);
        StringBuilder builderThree = new StringBuilder(name);
        StringBuilder builderFour = new StringBuilder();

        // first way for builderone
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(name.indexOf(" ") + 1));
        //Second Way for builderOne
        String[] two = name.split(" ");
//        System.out.println(two[0].charAt(0));
//        System.out.println(two[1].charAt(0));
        //third way for builderOne
        for (int i = 0; i < name.length(); i++) {
            if (i == 0 || name.charAt(i - 1) == ' ') {
                builderOne.append(name.charAt(i));
            }
        }

        //builder two
        builderTwo.reverse();

        //builder three
        int i = 0;
        while (i <= name.length()) {
            i++;
            if (name.indexOf('e') != -1) {
                int position = name.indexOf('e');
                builderThree.setCharAt(position, 'a');
            }
        }

        //builder four
        Random random = new Random();
        StringBuilder sb = new StringBuilder(name);
        for (int j = 0; j < name.length(); j++) {
            int index = random.nextInt(sb.length());
            builderFour.append(sb.charAt(index));
            sb.deleteCharAt(index);
        }
        //buider four second way
//        StringBuilder sb = new StringBuilder(name);
//        Random random = new Random();
//        while (sb.length() > 0) {
//            int index = random.nextInt(sb.length());
//            builderFour.append(sb.charAt(index));
//            sb.deleteCharAt(index);
//        }


        System.out.println(builderOne);
        System.out.println(builderTwo);
        System.out.println(builderThree);
        System.out.println(builderFour);


    }
}
