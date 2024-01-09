package Week4;

import java.util.Random;

public class Ex_04_11_Random_seed {
    public static void main(String[] args) {
        Random ran = new Random();


        for (int i = 0; i < 4; i++) {
            double decimalNumbers = ran.nextDouble();
            System.out.printf("%.2f ", decimalNumbers);

        }

        System.out.printf("%n");
        Random ran2 = new Random(60);
        Random ran3 = new Random(60);
        for (int i = 0; i < 9; i++) {
            int randomNumbers2= ran2.nextInt(42);
            int randomNumbers3 = ran3.nextInt(42);
            System.out.printf("%d %d ",randomNumbers2,randomNumbers3);
        }


    }
}
