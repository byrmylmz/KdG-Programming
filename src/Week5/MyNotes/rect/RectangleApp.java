package Week5.MyNotes.rect;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(40, 25);
        rect.setX(2);
        rect.setY(3);

        System.out.printf("X: %d \n", rect.getX());
        System.out.printf("Y: %d \n", rect.getY());
        System.out.printf("Heigh: %d \n", rect.getHeight());
        System.out.printf("Width: %d \n",rect.getWidth());
        System.out.printf("Surface:%d \n",rect.getArea());
        System.out.printf("Perimeter: %d \n",rect.getPerimeter());


        System.out.println(rect);

    }
}
