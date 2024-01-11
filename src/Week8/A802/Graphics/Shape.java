package Week8.A802.Graphics;

import Week8.A802.Interfaces.Comparable;

public abstract class Shape implements Comparable {
    private Integer x;
    private Integer y;

    public Shape(Integer x, Integer y) {
       setX(x);
       setY(y);

    }

    public Shape() {

    }

    public abstract void testAbs();

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }


}
