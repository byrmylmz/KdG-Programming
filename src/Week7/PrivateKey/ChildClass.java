package Week7.PrivateKey;


public class ChildClass extends ParentClass {
    private String name;

    public ChildClass(int value,String name) {
        super(value);
        this.name=name;
    }

    public void test(){
        //System.out.println("Private Field in ChildClass: " + privateField);
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "name='" + name + '\'' +
                '}';
    }
}

