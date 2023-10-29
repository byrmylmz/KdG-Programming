package Week6;

import java.util.Arrays;

public class Ex_06_08_Split {
    public static void main(String[] args) {
        String text ="Java can be tricky at times";

        String[] textArray = text.split(" ");
        for (String part:
             textArray) {
            System.out.printf(" \"%s\" ",part);
        }


    }
}
