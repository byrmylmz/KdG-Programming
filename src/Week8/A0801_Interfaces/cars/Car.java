package Week8.A0801_Interfaces.cars;

import Week8.A0801_Interfaces.interfaces.Printable;

public class Car implements Printable {
    private String brand;
    private String model;
    private String licensePlate;

    public Car(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    @Override
    public void print() {
        System.out.println("Car");
        System.out.println("===");
        System.out.println("Brand:         " + brand);
        System.out.println("Model:         " + model);
        System.out.println("License plate: " + licensePlate);
    }
}
