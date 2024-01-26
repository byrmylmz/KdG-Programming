package Week7.ex07_07_student_contact.contact;

/**
 * Author: Jan de Rijke
 */
public class Contact {
    private String email;
    private Phone fixed, mobile;
    
    public Contact(String email, String mobile, String fixed) {
        this.email = email;
        this.mobile = new Phone("mobile", mobile);
        this.fixed = new Phone("fixed", fixed);
    }
    
    @Override
    public String toString() {
        return String.format("email:\t\t\t%s\n%s\n%s", email, mobile, fixed);
    }
}
