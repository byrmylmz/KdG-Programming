package Week6;

import java.util.Arrays;

public class Ex_06_12_Parking_garage {
    public static void main(String[] args) {
        int[][][] parkingSpots = new int[2][2][15];


        for (int g = 0; g < parkingSpots.length; g++) {
            for (int f = 0; f < parkingSpots[0].length; f++) {
                for (int s = 0; s < 10; s++) {
                    parkingSpots[g][f][s] = s+1;
                }
            }
        }

        System.out.println(Arrays.toString(parkingSpots[1][1]));



    }
}
