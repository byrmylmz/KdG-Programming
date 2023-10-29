package Week6;

public class Ex_06_01_Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int number : numbers) {
            System.out.println(number);
        }
        //----------------------------------------------
        float[] stockMarkesRates = new float[20];
        for (int i = 0; i < stockMarkesRates.length; i++) {
            stockMarkesRates[i] = i;
            System.out.println(stockMarkesRates[i]);
        }


        System.out.printf("%d", numbers[1]);


        //-----------Extra sample from internet
        // Create an array with room for 100 integers
        int[] nums = new int[100];

        // Fill it with numbers using a for-loop
                for (int i = 0; i < nums.length; i++)
                    nums[i] = i + 1;  // +1 since we want 1-100 and not 0-99

        // Compute sum
                int sum = 0;
                for (int n : nums)
                    sum += n;

        // Print the result (5050)
                System.out.println(sum);

    }


}
