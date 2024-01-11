package Week7.Sample;

public class ParentClass {
    private String name;

    public ParentClass(String name) {
        this.name = name;
    }

    public ParentClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printname(){
        System.out.println(name);
    }


    @Override
    public String toString() {
        return "ParentClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
