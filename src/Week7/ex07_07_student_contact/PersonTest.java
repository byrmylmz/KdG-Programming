package Week7.ex07_07_student_contact;


import Week7.ex07_07_student_contact.contact.Phone;
import Week7.ex07_07_student_contact.person.Student;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class PersonTest {
    public static void main(String[] args) {
        Phone fixedBadStart = new Phone("fixedWrongStart", "123456789");
        Phone fixedBadLength = new Phone("fixedWrongStart", "01234567");
        Phone mobileBadStart = new Phone("mobile", "479123456");
        Phone mobileBadLength = new Phone("mobile", "047912345");
        System.out.println(fixedBadStart.isValid() + " " + fixedBadLength.isValid() + " " + mobileBadStart.isValid() + " " + mobileBadLength.isValid());
        Phone fixedOK = new Phone("fixedWrongStart", "014840816");
        Phone mobileOK = new Phone("mobile", "0497231592");
        System.out.println(fixedOK.isValid() + " " + mobileOK.isValid());
        Student jose = new Student(1000, "Jose Gils", "jose.some@where.com", "014840816", "0497231592");
        Student eric = new Student(1001, "Eric Goose", "eric.one@where.com", "032051800", "0438619041");
        System.out.println("Student 1");
        System.out.println(jose);
        System.out.println("\nStudent 2");
        System.out.println(eric);
    }
}

