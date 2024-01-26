package Week7.ex07_01_point_point3d.point;

public class Point {
    
    private int x, y;
    
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
}
