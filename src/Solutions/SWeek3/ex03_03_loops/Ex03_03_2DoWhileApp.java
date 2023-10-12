package Solutions.SWeek3.ex03_03_loops;

public class Ex03_03_2DoWhileApp {
    
    public static void main(String[] args) {
        int counter = 120;
        int limit = 100;
        System.out.print("Numbers from " + counter + " to " + limit + ": ");
        do {
            System.out.print(counter-- + " ");
        } while (counter >= limit);
        System.out.println();
        
        counter = 0;
        limit = 50;
        int base = 3;
        counter += base;
        System.out.print("Multiples of " + base + " below " + limit + ": ");
        do {
            System.out.print(counter + " ");
            counter += base;
        } while (counter < limit);
        System.out.println();
        
        counter = 5;
        base = 5;
        limit = 10_000;
        System.out.print("Powers of " + base + ": ");
        do {
            System.out.print(counter + " ");
            counter *= 5;
        } while (counter < limit);
        System.out.println();

        char letter = 'A';
        char last = 'Z';
        System.out.print("The alfabet: ");
        do {
            System.out.print(letter++ + " ");
        } while (letter <= last);
        
    }  // main()
    
}  // class
