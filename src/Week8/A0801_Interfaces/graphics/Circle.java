package Week8.A0801_Interfaces.graphics;

/**
 * author: Christian Cambier
 */
public class Circle extends Shape {
    /*
     * Instance data member(s)
     */
    private int radius;
    
    /*
     * Constructor(s)
     */
    // Default constructor
    public Circle() {
        /*
         Constants cannot be defined here since first statement must be
         a call to a constructor
            final int MIN_X = 0;
            final int MIN_Y = 0;
            final int MIN_RADIUS = 1;
            this(MIN_X, MIN_Y, MIN_RADIUS);	// Solution: see M8 (static)
         */
        this(0, 0, 1);
    }
    
    public Circle(int radius) {
        /*
         Constants cannot be defined here since first statement must be
         a call to a constructor
            final int MIN_X = 0;
            final int MIN_Y = 0;
            this(MIN_X, MIN_Y, radius);	// Solution: see M8 (static)
         */
        this(0, 0, radius);
    }
    
    public Circle(int x, int y, int radius) {
        super(x, y);
        setRadius(radius);
    }
    
    // Copy constructor
    public Circle(Circle rect) {
        this(rect.getX(), rect.getY(), rect.radius);
    }
    
    /*
     * Getter(s)/Setter(s)
     */
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        final int MIN_RADIUS = 1;
        final int MAX_RADIUS = 1000;
        
        if ((radius >= MIN_RADIUS) && (radius <= MAX_RADIUS)) {
            this.radius = radius;
        } else {
            System.out.printf("Invalid radius %d [%d..%d] \n", radius, MIN_RADIUS, MAX_RADIUS);
        }
    }
    
    /*
     * Method(s)
     */
    public void grow(int delta) {
        setRadius(radius + delta);
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return String.format("%s  radius=%-3d",super.toString(), radius);
    } // toString()
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        
        Circle circle = (Circle) o;
    
        return getRadius() == circle.getRadius();
    }
    
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getRadius();
        return result;
    }
    
    @Override
    public void print() {
        System.out.println("Circle");
        System.out.println("======");
        System.out.printf("Position: (%d, %d)%n", getX(), getY());
        System.out.println("Radius:   " + radius);
    }
}  // class
