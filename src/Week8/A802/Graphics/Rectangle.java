package Week8.A802.Graphics;

import Week8.A802.Interfaces.Printable;

import java.util.Objects;

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





    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public boolean isEqualTo(Object object) {
        return false;
    }

    @Override
    public boolean isGreaterThan(Object object) {
        return false;
    }

    @Override
    public boolean isLessThan(Object object) {
        return false;
    }
}
