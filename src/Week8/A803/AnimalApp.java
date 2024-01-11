package Week8.A803;

import Week8.A803.animals.Animals;
import Week8.A803.animals.Eagle;
import Week8.A803.animals.Ostrich;
import Week8.A803.animals.Swallow;
import Week8.A803.interfaces.EggLaying;
import Week8.A803.interfaces.Flying;
import Week8.A803.interfaces.Named;

import java.util.Arrays;

public class AnimalApp {

    public static void main(String[] args) {
        Animals animals = new Animals();

        animals.add(new Eagle("eagle", 2, 50, 160));
        animals.add(new Ostrich("ostrich", 6));
        animals.add(new Swallow("swallow", 4, 120));
        animals.print();




    }
}
