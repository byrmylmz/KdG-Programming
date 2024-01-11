package Week8.A805_Points_V2;

public class Point {
    
    public static final String COLOR = "red";
    public static int count = 0;
    private int x, y;
    
    public Point(int x, int y) {
        count++;
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
    
    public static String getColor() {
        return Point.COLOR;
    }
    
    public static int getCount() {
        return Point.count;
    }
    
}
