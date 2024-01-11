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
    public void testAbs(){
        System.out.println("rectagnle");
    }

    public double getArea(){return height*width;}

    @Override
    public void print() {
        System.out.println("Rectangle");
        System.out.println("========");
        System.out.printf("Position: (%d, %d) %n ",getX(),getY());
        System.out.printf("Area: %f %n",getArea());
    }
}
