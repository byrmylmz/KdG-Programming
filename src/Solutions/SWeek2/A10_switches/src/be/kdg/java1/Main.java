package Solutions.SWeek2.A10_switches.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    /*
    Enter the state of switch 1 (true or false): false
    Enter the state of switch 2 (true or false): false
    Enter the state of switch 3 (true or false): false
    At most one switch is turned on.
    */
    /*
    Enter the state of switch 1 (true or false): false
    Enter the state of switch 2 (true or false): true
    Enter the state of switch 3 (true or false): false
    At most one switch is turned on.
    */
    /*
    Enter the state of switch 1 (true or false): true
    Enter the state of switch 2 (true or false): false
    Enter the state of switch 3 (true or false): true
    At least two switches are turned on.
    Exactly two switches are turned on.
    */
    /*
    Enter the state of switch 1 (true or false): true
    Enter the state of switch 2 (true or false): true
    Enter the state of switch 3 (true or false): true
    At least two switches are turned on.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the state of switch 1 (true or false): ");
        boolean switch1 = scanner.nextBoolean();
        System.out.print("Enter the state of switch 2 (true or false): ");
        boolean switch2 = scanner.nextBoolean();
        System.out.print("Enter the state of switch 3 (true or false): ");
        boolean switch3 = scanner.nextBoolean();

        if (switch1 && switch2 || switch1 && switch3 || switch2 && switch3) {
            System.out.println("At least two switches are turned on.");
        }
        if ((switch1 && switch2 || switch1 && switch3 || switch2 && switch3)
                && (!switch1 || !switch2 || !switch3)) {
            System.out.println("Exactly two switches are turned on.");
        }
        if (!switch1 && !switch2 || !switch1 && !switch3 || !switch2 && !switch3) {
            System.out.println("At most one switch is turned on.");
        }
    }
}
