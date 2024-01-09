package Week5.Ex_05_07_Circle;

public class Circle {
    private int radius;
    private String colour;

    public Circle(int radius, String colour) {
        setRadius(radius);
        setColour(colour);
    }

    public Circle(int radius) {
        setColour("Black");
        setRadius(radius);
    }


    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public double surface() {
        return  Math.PI * Math.pow(this.radius, 2);
    }

    public double deltaCircumference(Circle other){
        return Math.abs((other.circumference()-this.circumference()));
    }
    public double deltaSurface(Circle other){
        return this.circumference()-other.circumference();
    }


    public void setRadius(int radius) {
        if(radius<10 || radius>1000){
            System.out.printf("Invalid Radius: %d \n",radius);
        }else {
            this.radius = radius;
        }

    }

    public int getRadius() {
        return radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString(){
       return String.format("Colour: %s Radius: %d circumference: %.2f surface: %.2f",this.colour,this.radius,this.circumference(),this.surface());
    }
//--------------------------------------------------------------------------------
    public static void main(String[] args) {
        Circle tooSmall = new Circle(5);
        System.out.println(tooSmall);

        Circle tooBig = new Circle(1200);
        System.out.println(tooBig);

        Circle small = new Circle(10, "Red");
        System.out.println(small);

        Circle big = new Circle(200, "Blue");
        System.out.println(big);

        System.out.printf("Difference in circumference (%s - %s): %.2f%n", big.getColour(), small.getColour(), big.deltaCircumference(small));
        System.out.printf("Difference in surface (%s - %s): %.2f%n", big.getColour(), small.getColour(), big.deltaSurface(small));
    }  // main()

}
