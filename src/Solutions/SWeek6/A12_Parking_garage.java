package Solutions.SWeek6;

import java.util.Random;

public class A12_Parking_garage {
    public static void main(String[] args) {
        int[][][] parkingSpots = new int[2][2][15];
        Random generator = new Random();

        for (int[][] garage : parkingSpots) {
            for (int[] floor : garage) {
                for (int i = 0; i < floor.length; i++) {
                    floor[i] = generator.nextInt(10);
                }
            }
        }

        for (int garage = 0; garage < parkingSpots.length; garage++) {
            int sum = 0;
            for (int[] floor : parkingSpots[garage]) {
                for (int parkingSpot : floor) {
                    sum += parkingSpot;
                }
            }
            System.out.printf("Garage %d: used %d times%n", garage + 1, sum);
        }
    }
}
