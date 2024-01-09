package Week6.Ex_06_13;

import java.util.Random;

public class Dice {
    private int numberOne;
    private int numberTwo;

   public Dice(){
       Random generator = new Random();
       this.numberOne= generator.nextInt(6);
       this.numberTwo= generator.nextInt(6);
   }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    @Override
    public String toString() {
       return String.format("%d %d",numberOne,numberTwo);
    }
}
