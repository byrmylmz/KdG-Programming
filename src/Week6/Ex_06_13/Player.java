package Week6.Ex_06_13;

public class Player {
    private int numberOfCoins;
    private String name;

    public Player(String name) {
        this.numberOfCoins = 10;
        this.name=name;
    }

    public Dice rolling(){

        Dice dice = new Dice();
        return dice;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
