package Week6;

import java.util.Arrays;

public class Ex_06_07_Arrays_v2 {
    public static void main(String[] args) {
        StringBuilder[] suits = {
                new StringBuilder("hearts"),
                new StringBuilder("clubs"),
                new StringBuilder("diamonds"),
                new StringBuilder("spades")
        };
        for(StringBuilder sb : suits) {
            System.out.println(sb);
        }


    }
}
