package Solutions.SWeek4;

import java.util.Random;

public class Ex_01_lottery {
    public static void main(String[] args) {
        // Constructor without parameters
        // Random random = new Random();

        // Constructor with one parameter
        Random random = new Random(100);

        for (int i = 0; i < 10; i++) {
            System.out.println("Lottery number " + (i + 1) + ": " + (random.nextInt(45) + 1));
        }
    }
}
