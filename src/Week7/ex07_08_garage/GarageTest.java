package Week7.ex07_08_garage;

import Week7.ex07_08_garage.garage.Car;
import Week7.ex07_08_garage.garage.Garage;


public class GarageTest {
    public static void main(String[] args) {
        Car car = new Car("Ford S-MAX");
        Garage garage = new Garage("Neyt");
        car.setGarage(garage);

        System.out.println(car);  // implicit call to toString

        car = new Car("Ford Focus", garage);

        System.out.println(car);  // implicit call to toString

        car = new Car("Mercedes C", new Garage("Van Winkel"));

        System.out.println(car);  // implicit call to toString

        Car copy = new Car(car);

        System.out.println(copy);  // implicit call to toString
    }
}

/*
Car: Ford S-MAX Garage: Neyt
Car: Ford Focus Garage: Neyt
Car: Mercedes C Garage: Van Winkel
Car: Mercedes C Garage: Van Winkel
*/