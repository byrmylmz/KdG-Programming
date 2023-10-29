package Week4;

public class Ex_04_05_Comparing_String {
    public static void main(String[] args) {
        String stringOne = "java";
        String stringTwo = "Jakarta";
        String stringThree = "JAVA";

        // Convert the strings to lowercase for comparison
        String lowerStringOne = stringOne.toLowerCase();
        String lowerStringTwo = stringTwo.toLowerCase();
        String lowerStringThree = stringThree.toLowerCase();

        // Compare the strings and print the results
        if (lowerStringOne.equals(lowerStringTwo)) {
            System.out.println(stringOne + " and " + stringTwo + " are equal.");
        } else {
            System.out.println(stringOne + " and " + stringTwo + " are not equal.");
        }

        if (lowerStringTwo.equals(lowerStringThree)) {
            System.out.println(stringTwo + " and " + stringThree + " are equal.");
        } else {
            System.out.println(stringTwo + " and " + stringThree + " are not equal.");
        }

        if (lowerStringOne.equals(lowerStringThree)) {
            System.out.println(stringOne + " and " + stringThree + " are equal.");
        } else {
            System.out.println(stringOne + " and " + stringThree + " are not equal.");
        }
    }

}
