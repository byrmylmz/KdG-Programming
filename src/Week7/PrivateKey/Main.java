package Week7.PrivateKey;

public class Main {
    public static void main(String[] args) {
//        ChildClass child = new ChildClass(42);
//        child.printPrivateField(); // This is fine, as it calls the public method in the parent class
//        child.test();

        ChildClass child1= new ChildClass(53,"bayram");


        System.out.println( child1.getClass().getSimpleName());



    }
}
