package Week8.A0801_Interfaces.graphics;

import Week8.A0801_Interfaces.interfaces.Printable;

/**
 * author: Christian Cambier
 */
public abstract class Shape implements Printable {
    /*
     * Instance data member(s)
     */
    private int x;
    private int y;
    
    /*
     * Constructor(s)
     */
    protected Shape(int x, int y) {
        setX(x);
        setY(y);
    }
    
    /*
     * Getter(s)/Setter(s)
     */
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        final int MIN_X = 0;
        final int MAX_X = 1000;
        
        if ((x >= MIN_X) && (x <= MAX_X)) {
            this.x = x;
        } else {
            System.out.printf("Invalid x %d [%d..%d] \n", x, MIN_X, MAX_X);
        }
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        final int MIN_Y = 0;
        final int MAX_Y = 1000;
        
        if ((y >= MIN_Y) && (y <= MAX_Y)) {
            this.y = y;
        } else {
            System.out.printf("Invalid y %d [%d..%d] \n", y, MIN_Y, MAX_Y);
        }
    }
    
    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }
    
    /*
     * Method(s)
     */
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public String toString() {
        return String.format("x=%-3d   y=%-3d   area=%-8.02f   perimeter=%-8.02f", getX(), getY(), getArea(), getPerimeter());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Shape shape = (Shape) o;
        
        if (x != shape.x) {
            return false;
        }
        return y == shape.y;
    }
    
    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}  // class
