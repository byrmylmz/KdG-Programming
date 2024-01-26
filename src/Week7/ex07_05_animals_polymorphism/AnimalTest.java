package Week7.ex07_05_animals_polymorphism;

import Week7.ex07_05_animals_polymorphism.animals.*;
import Week7.ex07_05_animals_polymorphism.animals.Dog;

public class AnimalTest {
    public static void main(String[] args) {
		Animal[] garden = {
				new Dog("Ramses", "Border Collie", "black", "5522"),
				new Rabbit("Floppy", "Angora", "gray", true)
		};
		String[] names = {"Leonardo", "Donatello"};
		for (int i = 0; i < garden.length; i++) {
			System.out.println(garden[i]);
			garden[i].setName(names[i]);
			System.out.println(garden[i]);
		}
    }  // main()
}
