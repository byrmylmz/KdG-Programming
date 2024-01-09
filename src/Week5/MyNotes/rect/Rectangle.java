package Week5.MyNotes.rect;

public class Rectangle {
    private int x;
    private int y;
    private int height;
    private int width;


    public Rectangle(){}

    public Rectangle(int height, int width) {

        setHeight(height);
        setWidth(width);
    }

    public Rectangle(int x, int y, int height, int width) {
        this(height,width);
      setX(x);
      setY(y);
    }

    public Rectangle(Rectangle other){
        this(other.x,other.y,other.height,other.width);

    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return (this.height * 2) + (this.width * 2);
    }

    public int getPerimeter() {
        return this.height * this.width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        }
    }
    public String toString(){
        return String.format("Area: %d", getArea());
    }
}
