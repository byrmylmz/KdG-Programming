package Week6.MyNotes;

import java.util.Arrays;
import java.util.Random;

public class array {
    public static void main(String[] args) {

        int[] numbers = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 9, 14
        };

        System.out.println(Arrays.stream(numbers).average());
    }
}
