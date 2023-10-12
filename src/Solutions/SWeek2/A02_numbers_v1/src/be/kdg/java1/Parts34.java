package Solutions.SWeek2.A02_numbers_v1.src.be.kdg.java1;

public class Parts34 {
    public static void main(String[] args) {
        //
        // PART 3
        //
        int first = 8;
        int second = 5;

        System.out.println("sum: " + (8 + 5));
        System.out.println("difference: " + (8 - 5));
        System.out.println("product: " + 8 * 5);
        System.out.println("quotient: " + 8 / 5);
        System.out.println("remainder: " + 8 % 5);

        //
        // PART 4
        //
        int result;

        System.out.println("first: " + first);
        result = ++first;
        System.out.println("result = ++first");
        System.out.println("result: " + result);
        System.out.println("first: " + first);

        result = first++;
        System.out.println("result = first++");
        System.out.println("result: " + result);
        System.out.println("first: " + first);

        System.out.println("second: " + second);
        result = --second;
        System.out.println("result = --second");
        System.out.println("result: " + result);
        System.out.println("second: " + second);

        result = second--;
        System.out.println("result = second--");
        System.out.println("result: " + result);
        System.out.println("second: " + second);
    }
}
