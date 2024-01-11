package Week8.A803.animals;

import Week8.A803.interfaces.EggLaying;
import Week8.A803.interfaces.Flying;
import Week8.A803.interfaces.Named;

public class Swallow implements Named, EggLaying, Flying {

    private String name;
    private int numberOfEggsPerYear;
    private int maxSpeed;

    public Swallow(String name, int numberOfEggsPerYear, int maxSpeed) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
        this.maxSpeed = maxSpeed;
    }


    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfEggsPerYear() {
        return numberOfEggsPerYear;
    }


    public int getMaxFlyingSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Eggs: " + getNumberOfEggsPerYear() + "\n"
                + "Speed: " + getMaxFlyingSpeed() + "\n";
    }
}
