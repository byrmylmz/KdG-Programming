package Week7.ex07_08_garage.garage;


public class Garage {
    private String name;

    public Garage(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Garage: " + name;
    }

}
