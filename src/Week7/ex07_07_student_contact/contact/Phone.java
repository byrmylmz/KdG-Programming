package Week7.ex07_07_student_contact.contact;

/**
 * Author: Jan de Rijke
 */
public class Phone {
    private String number;
    private String type;
    private final int LENGTH_MOBILE = 10;
    private final int LENGTH_FIXED = 9;
    
    public Phone(String type, String number) {
        this.number = number;
        this.type = type;
    }
    
    @Override
    public String toString() {
        return String.format("%s phone:\t%s", type, number);
    }
    
    public boolean isValid() {
        return number.startsWith("0") && number.length() ==(type.equals("fixed")? LENGTH_FIXED:LENGTH_MOBILE);


    }
}
