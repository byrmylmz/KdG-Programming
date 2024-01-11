package Week7.Aggregation;

public class Person {
    private String name;
    private Phone phone;

    public Person(String name,Phone phone) {
        this.name = name;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    public static void main(String[] args) {
        Person somePerson = new Person("bayram",new Phone("123213"));

        System.out.println(somePerson.toString());

        System.out.println(somePerson.phone.toString());
    }

}

