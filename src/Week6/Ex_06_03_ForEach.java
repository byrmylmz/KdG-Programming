package Week6;

public class Ex_06_03_ForEach {
    public static void main(String[] args) {
        int[] lotteryNumbers = {3, 6, 17, 31, 32, 43};

        for (int i : lotteryNumbers)
            System.out.print(i + " ");

        lotteryNumbers[1] = 13;
        System.out.println();

        for(int j : lotteryNumbers)
            System.out.print(j + " ");
        System.out.println();

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (i + 1) * 7;

        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();

        for (int i = arr.length - 1; i >= 0 ; i--)
            System.out.print(arr[i] + " ");

    }
}
