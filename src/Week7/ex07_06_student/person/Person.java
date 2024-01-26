package Week7.ex07_06_student.person;


import Week7.ex07_06_student.contact.Phone;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class Person {
    private Phone phone;
    private String name;

    public Person(String phoneNr, String name) {
        this.phone = new Phone(phoneNr);
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Person persoon = (Person) object;

        return phone == persoon.phone;
    }

    @Override
    public int hashCode() {
        return phone.hashCode()^ name.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s", name, phone);
    }
}


