package Week4;

import java.util.Arrays;
import java.util.Random;

public class Ex_04_01_Lottery {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(100);

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(45) + 1);
        }



    }
}
