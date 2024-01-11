package Week8.A803.animals;

import Week8.A803.AnimalApp;
import Week8.A803.interfaces.Named;

import java.util.Arrays;
import java.util.Objects;

public class Animals {

    private Named[] animals;

    private Integer amount;

    public Animals() {
        this.animals= new Named[100];
        amount=0;
    }

    public void add(Named named){
        animals[amount]=named;
        amount++;
    }


    public void print() {
        for (int i = 0; i < amount; i++) {
            System.out.println(animals[i]);
        }
    }
}
