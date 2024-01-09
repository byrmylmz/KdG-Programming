package Week8.A801.Cars;

import Week8.A801.Interfaces.Printable;

public class Car implements Printable {

    private String brand;
    private String model;
    private String licencePlate;

    public Car(String brand, String model, String licencePlate) {
        this.brand = brand;
        this.model = model;
        this.licencePlate = licencePlate;
    }


    @Override
    public void print() {
        System.out.println("Car");
        System.out.println("===");
        System.out.println("Brand:         " + brand);
        System.out.println("Model:         " + model);
        System.out.println("License plate: " + licencePlate);
    }
}
