package Week7.ex07_02_point_tostring.point;

public class Point {
    
    private int x, y;
    
    public Point() {
    }
    
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public String toString() {
        return String.format("x: %d y: %d", x, y);
    }
}
