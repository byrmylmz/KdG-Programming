package Solutions.SWeek5.ex07circle;

public class Circle {
    private int radius;
    private String colour = "Black";
    final int MIN_RADIUS = 10;
    final int MAX_RADUS = 1000;

    public Circle(int radius, String colour) {
        this.setRadius(radius);
        this.colour = colour;
    }

    public Circle(int radius) {
        this.setRadius(radius);
    }

    public void setRadius(int radius) {
        if (MIN_RADIUS <= radius && radius <= MAX_RADUS) {
            this.radius = radius;
        } else {
            System.out.printf("Invalid radius %d \n", radius);
        }
    }

    //  2 x PI x r
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    //
    // PI * r²
    public double surface() {
        return Math.PI * radius * radius;
    }

    // Absolute difference circumference
    public double deltaCircumference(Circle other) {
       return Math.abs(this.circumference() - other.circumference());
    }

	// Absolute difference surface
    public double deltaSurface(Circle other) {
        return Math.abs(this.surface() - other.surface());
    }

    @Override
    public String toString() {
        return String.format("Colour: %s\tRadius: %d\tCircumference: %.2f\tSurface: %.2f",
	        colour, radius, circumference(), surface());
    }
}
