package Week8.A801.Graphics;

public abstract class Shape {
    private Integer x;
    private Integer y;

    public Shape(Integer x, Integer y) {
       setX(x);
       setY(y);

    }

    public Shape() {

    }

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
