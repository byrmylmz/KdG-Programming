package Week7.ex07_07_student_contact.person;

import Week7.ex07_07_student_contact.contact.Contact;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class Person {
    private Contact contact;
    private String name;
    
    public Person(String name, String email, String fixed, String mobile) {
        this.contact = new Contact(email, mobile, fixed);
        this.name = name;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Person persoon = (Person) object;
        return contact == persoon.contact;
    }
    
    @Override
    public int hashCode() {
        return contact.hashCode() ^ name.hashCode();
    }
    
    @Override
    public String toString() {
        return String.format("name:\t\t\t%s\n%s", name, contact);
    }
}


