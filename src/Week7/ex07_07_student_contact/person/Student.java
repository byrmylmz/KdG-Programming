package Week7.ex07_07_student_contact.person;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class Student extends Person {
    private int studentNumber;
    
    public Student(int studentNumber, String name, String email, String mobile, String fixed) {
        super(name, email, mobile, fixed);
        this.studentNumber = studentNumber;
    }
    
    @Override
    public String toString() {
        return String.format("studentNumber:\t%6d\n%s", studentNumber, super.toString());
    }
}
