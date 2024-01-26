package Week7.ex07_05_animals_polymorphism.animals;

public class Dog extends Animal {
    private String chipNumber;
    
    public Dog(String name, String breed, String colour, String chipNumber) {
        super(name, breed, colour, "Like a dog in a bowling game");
        setChipNumber(chipNumber);
    }
    
    public String getChipNumber() {
        return chipNumber;
    }
    
    private void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }
    
    public String toString() {
        return String.format("%s with chip %s", super.toString(), chipNumber);
    }
}
