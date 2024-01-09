package Week5.MyNotes.Car;

public class Car {
    public int speed;

    public Car() {
    }

    public Car(int speed) {
        setSpeed(speed);
    }

    public void setSpeed(int speed) {
        final int MIN_SPEED = -20;
        final int MAX_SPEED = 300;

        if ((speed >= MIN_SPEED) && (speed <= MAX_SPEED)) {
            this.speed = speed;

        } else {
            System.out.printf("Invalid speed: %d \n", speed);
        }

    }

    public void report() {
        System.out.printf("Speed= %d km/h \n", speed);
    }

    public void report(String unit) {
        System.out.printf("Speed = %d %s km/h \n", speed, unit);
    }
}
