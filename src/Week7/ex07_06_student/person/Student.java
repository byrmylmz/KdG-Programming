package Week7.ex07_06_student.person;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class Student extends Person {
    private int studentNumber;

    public Student(String phoneNr, String name, int studentNumber) {
        super(phoneNr, name);
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return String.format("studentNumber: %6d - %s", studentNumber, super.toString());
    }
}
