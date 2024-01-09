package Solutions.SWeek5.ex07circle;

public class DemoCircle {
    public static void main(String[] args) {
        Circle tooSmall = new Circle(5);
        System.out.println(tooSmall);

        Circle tooBig = new Circle(1200);
        System.out.println(tooBig);

        Circle small = new Circle(10, "Red");
        System.out.println(small);

        Circle big = new Circle(200, "Blue");
        System.out.println(big);

        System.out.printf("Difference in circumference (red - blue): %.2f%n", small.deltaCircumference(big));
        System.out.printf("Difference in surface (blue - red): %.2f%n", big.deltaSurface(small));

    }
}