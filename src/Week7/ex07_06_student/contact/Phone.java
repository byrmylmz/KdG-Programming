package Week7.ex07_06_student.contact;

/**
 * Author: Jan de Rijke
 */
public class Phone {
	private String number;

	public Phone(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phonenumber=" + number ;
	}
}
