package Week8.A801.Graphics;

import Week8.A801.Interfaces.Printable;

public class Circle extends Shape implements Printable {
    private Integer radius;

    public Circle (){

    }

    public void testAbs(){
        System.out.println("circle");
    }

    public Circle(Integer radius,Integer x,Integer y) {
        super(x,y);
        setRadius(radius);
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Circle");
        System.out.println("========");
        System.out.printf("Position: (%d, %d) %n ",getX(),getY());
        System.out.printf("Radius: %d %n",getRadius());
    }
}
