package Week5.ex04operations;

public class Operations {
    private int numberOne;
    private int numberTwo;

    public Operations(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int sum() {
        return numberOne + numberTwo;
    }

    public int difference() {
        return numberOne - numberTwo;
    }

    public int product() {
        return numberOne * numberTwo;
    }

    public double quotient() {
        return (double) numberOne / numberTwo;
    }
}
