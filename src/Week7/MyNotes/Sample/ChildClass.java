package Week7.MyNotes.Sample;

public class ChildClass extends ParentClass {
    private Integer age;

    public ChildClass(Integer age,String name) {
        super(name);
        setAge(age);

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printAge(){
        System.out.println(getAge());
    }


    @Override
    public String toString() {
        return "ChildClass{" +
                "age=" + age +
                '}';
    }
}
