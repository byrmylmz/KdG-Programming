package Week7.ex07_08_garage.garage;


public class Car {
    private String brand;
    private Garage garage;

    public Car(String brand) {
        this(brand, null);
    }

    public Car(Car car) {
        this(car.brand, car.garage);
    }

    public Car(String brand, Garage garage) {
        setBrand(brand);
        setGarage(garage);
    }

    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
         return "Car: " + brand + " " + garage;
    }
}
