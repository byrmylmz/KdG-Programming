package Week8.A803.animals;

import Week8.A803.interfaces.EggLaying;
import Week8.A803.interfaces.Flying;
import Week8.A803.interfaces.Named;

public class Eagle implements Named, EggLaying, Flying {
    private String name;
    private int numberOfEggsPerYear;
    private int maxSpeed;
    private int divingSpeed;

    public Eagle(String name, int numberOfEggsPerYear, int maxSpeed, int divingSpeed) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
        this.maxSpeed = maxSpeed;
        this.divingSpeed = divingSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getNumberOfEggsPerYear() {
        return numberOfEggsPerYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getDivingSpeed() {
        return divingSpeed;
    }

    @Override
    public String toString() {
            return "Name: " + getName() + "\n"
                    + "Eggs: " + getNumberOfEggsPerYear() + "\n"
                    + "Speed: " + getMaxFlyingSpeed() + "\n"
                    + "Divingspeed: " + getDivingSpeed() + "\n";
        }

    @Override
    public int getMaxFlyingSpeed() {
        return 0;
    }
}
