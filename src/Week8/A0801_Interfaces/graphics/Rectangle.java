package Week8.A0801_Interfaces.graphics;

/**
 * author: Christian Cambier
 */
public class Rectangle extends Shape {
    /*
     * Instance data member(s)
     */
    private int height;
    private int width;
    
    /*
     * Constructor(s)
     */
    // Default constructor
    public Rectangle() {
        /*
         Constants cannot be defined here since first statement must be
         a call to a constructor
            final int MIN_X = 0;
            final int MIN_Y = 0;
            final int MIN_HEIGHT = 1;
            final int MIN_WIDTH = 1;
            this(MIN_X, MIN_Y, MIN_HEIGHT, MIN_WIDTH);	// Solution: see M8 (static)
         */
        this(0, 0, 1, 1);
    }
    
    public Rectangle(int height, int width) {
        /*
         Constants cannot be defined here since first statement must be
         a call to a constructor
            final int MIN_X = 0;
            final int MIN_Y = 0;
            this(MIN_X, MIN_Y, height, width);	// Solution: see M8 (static)
         */
        this(0, 0, height, width);
    }
    
    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        setHeight(height);
        setWidth(width);
    }
    
    // Copy constructor
    public Rectangle(Rectangle rect) {
        this(rect.getX(), rect.getY(), rect.height, rect.width);
    }
    
    /*
     * Getter(s)/Setter(s)
     */
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        final int MIN_HEIGHT = 1;
        final int MAX_HEIGHT = 1000;
        
        if ((height >= MIN_HEIGHT) && (height <= MAX_HEIGHT)) {
            this.height = height;
        } else {
            System.out.printf("Invalid height %d [%d..%d] \n", height, MIN_HEIGHT, MAX_HEIGHT);
        }
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        final int MIN_WIDTH = 1;
        final int MAX_WIDTH = 1000;
        
        if ((width >= MIN_WIDTH) && (width <= MAX_WIDTH)) {
            this.width = width;
        } else {
            System.out.printf("Invalid width %d [%d..%d] \n", width, MIN_WIDTH, MAX_WIDTH);
        }
    }
    
    /*
     * Method(s)
     */
    public void grow(int delta) {
        setHeight(height + delta);
        setWidth(width + delta);
    }
    
    public void grow(int deltaH, int deltaW) {
        setHeight(height + deltaH);
        setWidth(width + deltaW);
    }
    
    public double getArea() {
        return height * width;
    }
    
    public double getPerimeter() {
        return (height + width) * 2;
    }
    
    public String toString() {
        return String.format("%s  height=%-3d   width=%-3d", super.toString(), height, width);
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
        
        Rectangle rectangle = (Rectangle) o;
        
        if (getHeight() != rectangle.getHeight()) {
            return false;
        }
        return getWidth() == rectangle.getWidth();
    }
    
    @Override
    public int hashCode() {
        int result = getHeight();
        result = 31 * result + getWidth();
        return result;
    }
    
    @Override
    public void print() {
        System.out.println("Rectangle");
        System.out.println("=========");
        System.out.printf("Position: (%d, %d)%n", getX(), getY());
        System.out.println("Width:    " + width);
        System.out.println("Height:   " + height);
    }
}  // class
