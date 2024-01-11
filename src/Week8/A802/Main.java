package Week8.A802;

import Week8.A802.Cars.Car;
import Week8.A802.Graphics.Circle;
import Week8.A802.Graphics.Rectangle;
import Week8.A802.Graphics.Shape;
import Week8.A802.Interfaces.Printable;

public class Main {
    public static void main(String[] args) {

//        part1();
//        part2();
//        part3();
//        PartBayram();
//        carEqual();

          String bayram ="bayram";
          String mehmet = "bayra";

          System.out.println(bayram.compareTo(mehmet));




    }

    private static void part1() {
        Car[] cars = {
                new Car("Peugeot", "208", "1-ABC-123"),
                new Car("Opel", "Corsa", "1-DEF-456"),
                new Car("Volkswagen", "Golf", "1-GHI-789"),
                new Car("Renault", "Clio", "1-JKL-012"),
                new Car("Ford", "Fiesta", "1-MNO-345")
        };

        System.out.println(">>>>>>>>>>>>>>>>>>>> PART 1 <<<<<<<<<<<<<<<<<<<<");
        for (Car car : cars) {
            car.print();
            System.out.println(); // empty line
        }
    }

    private static void printPrintables(Printable[] printables) {
        for (Printable printable : printables) {
            printable.print();
            System.out.println(); // empty line
        }
    }

    private static void PartBayram() {
        Shape[] shapes = {
                new Circle(10, 10, 5),
                new Rectangle(0, 100, 20, 30),
        };

        for (Shape shape: shapes
             ) {
          shape.testAbs();
        }
    }

    private static void part2() {
        Printable[] printables = {
                new Car("Peugeot", "208", "1-ABC-123"),
                new Circle(10, 10, 5),
                new Circle(50, 100, 20),
                new Rectangle(0, 100, 20, 30),
                new Car("Ford", "Fiesta", "1-MNO-345")
        };

        System.out.println(">>>>>>>>>>>>>>>>>>>> PART 2 <<<<<<<<<<<<<<<<<<<<");
        for (Printable printable : printables) {
            System.out.printf("%s",printable.test);

            /*if (printable instanceof Car) {
                Car c = (Car)printable;
                // Car-specific things
            }*/
            System.out.println(); // empty line
        }
    }

    private static void part3() {
        Printable[] printables = {
                new Circle(50, 50, 50),
                new Circle(0, 0, 100),
                new Rectangle(100, 100, 20, 20),
                new Rectangle(-50, -50, 30, 30),
                new Car("Volkswagen", "Golf", "1-GHI-789"),
        };

        System.out.println(">>>>>>>>>>>>>>>>>>>> PART 3 <<<<<<<<<<<<<<<<<<<<");
        for (Printable printable : printables) {
            printable.print();
            System.out.println(); // empty line
        }
    }

    public static void carEqual() {
        Car car1 = new Car("Peugeot", "208", "1-ABC-123");
        Car car2 = new Car("Peugeot", "208", "2-XYZ-123");
        Car car3 = new Car("Opel", "Corsa", "1-DEF-456");

        System.out.printf("%b",car1.isEqualTo(car2));
    }
}
