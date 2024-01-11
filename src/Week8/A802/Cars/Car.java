package Week8.A802.Cars;

import Week8.A802.Interfaces.Comparable;
import Week8.A802.Interfaces.Printable;

import java.util.Objects;

public class Car implements Printable, Comparable {

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


    @Override
    public boolean isEqualTo(Object object) {
        if (object instanceof Car otherCar) {
            return brand.equals(otherCar.brand) && model.equals(otherCar.model);
        } else {
            return false;
        }
    }

    @Override
    public boolean isGreaterThan(Object object) {
        if (object instanceof Car) {
            Car otherCar = (Car) object;
            if (brand.equals(otherCar.brand)) {
                return model.compareTo(otherCar.model) > 0;
            } else {
                return brand.compareTo(otherCar.brand) > 0;
            }
        }else{
            return false;
        }
    }



    @Override
    public boolean isLessThan(Object object) {
        return false;
    }
}
