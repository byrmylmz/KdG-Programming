package Week5.MyNotes.Car;

public class NoEncapsulationApp {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(50);
        myCar.report();
        myCar.report("by");
        myCar.setSpeed(50000);
        myCar.report();
        myCar.setSpeed(-50000);
        myCar.report();

        Car mycar2= new Car(58);
        mycar2.report("haha");
    }
}
