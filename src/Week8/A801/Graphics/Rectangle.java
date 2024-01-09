package Week8.A801.Graphics;

import Week8.A801.Interfaces.Printable;

public class Rectangle extends Shape implements Printable {
    private Integer width;
    private Integer height;

    public Rectangle(Integer width,Integer height,Integer x, Integer y){
        super(x,y);
        this.width=width;
        this.height=height;

    }

    @Override
    public void print() {

    }
}
