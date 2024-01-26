package Week7.ex07_05_animals_polymorphism.animals;

public class Rabbit extends Animal {
    
    private boolean digs;
    
    public Rabbit(String name, String breed, String colour, boolean digs) {
        super(name, breed, colour, "I'm an Ice Rabbit");
        setDigs(digs);
    }
    
    public boolean getDigs() {
        return digs;
    }
    
    public void setDigs(boolean digs) {
        this.digs = digs;
    }
    
    public String toString() {
        return String.format("%s that %s", super.toString(), (digs ? "digs." : "does not dig."));
    }
}
