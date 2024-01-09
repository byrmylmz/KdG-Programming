package Week5.MyNotes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(){
        this(1.9);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle newCircle = new Circle(20);
        System.out.print(newCircle);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
