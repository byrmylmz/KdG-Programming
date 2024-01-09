package Solutions.SWeek6;

public class A02_Lottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = {3, 6, 17, 31, 32, 43};

        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.print(lotteryNumbers[i] + " ");
        }

        lotteryNumbers[1] = 13;

        System.out.println();
        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.print(lotteryNumbers[i] + " ");
        }
    }
}
