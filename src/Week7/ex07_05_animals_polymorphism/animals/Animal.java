package Week7.ex07_05_animals_polymorphism.animals;

public abstract class Animal {
    private String name;
    private String breed;
    private String colour;
    private String tagLine;
    
    public Animal(String name, String breed, String colour, String tagLine) {
        setName(name);
        setBreed(breed);
        setColour(colour);
        setTagLine(tagLine);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return colour;
    }
    
    public String getTagLine() {
        return tagLine;
    }
    
    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s is a %s %s (%s)", getClass().getSimpleName(), name, colour, breed, tagLine);
    }
}
