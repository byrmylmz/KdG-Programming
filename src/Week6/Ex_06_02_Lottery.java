package Week6;

import java.util.Arrays;

public class Ex_06_02_Lottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = {3, 6, 17, 31, 32, 43};
        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.println(lotteryNumbers[i]);
        }
        lotteryNumbers[1]=13;

        for(int number:lotteryNumbers){
            System.out.println(number);
        }

        //quick way of printing the array.
        System.out.println(Arrays.toString(lotteryNumbers));
    }
}
