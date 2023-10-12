package Solutions.SWeek3.ex03_05_factorial;

public class FactorialApp {
    
    public static void main(String[] args) {
        long result = 1;

        for (int number = 1; number <=20 ; number++) {
	        result *= number;
	        System.out.printf("%d! = %d \n", number, result);
        }
    }  // main()
    
}  // class
