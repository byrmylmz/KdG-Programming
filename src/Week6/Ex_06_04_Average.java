package Week6;

public class Ex_06_04_Average {
    public static void main(String[] args) {
        int[] numbers = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 9, 14
        };

        //my way
        int total = 0;
        for (int number : numbers)
            total = total + number;

        System.out.println((double)total / numbers.length);

        // second way
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.printf("The average is %.2f",(double)sum/++i);
    }


}
