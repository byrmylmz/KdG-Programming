package Solutions.SWeek2.A02_numbers_v1.src.be.kdg.java1;

public class Parts12 {
    public static void main(String[] args) {
        //
        // PART 1
        //
        int a = 2_000_000_000;
        int b = 2_000_000_000;
        int sum = a + b;

        System.out.println("SUM: " + sum);

        // Fix:
        long sumLong = (long)a + b;
        System.out.println("SUM: " + sumLong);
        // Casting either 'a' or 'b' as a long (or both) is mandatory: the temporary result of 'a + b'
        // should be stored as a long even before assigning to 'sumLong'!

        //
        // PART 2
        //
        long l1 = 10000;
        long l2 = 10000;

        //int result = l1 + l2;  --> doesn't compile!
        //System.out.println("Result: " + result);

        // Fix:
        int result = (int)(l1 + l2);
        System.out.println("Result: " + result);
    }
}
