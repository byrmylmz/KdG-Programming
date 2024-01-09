package Solutions.SWeek6;

public class A09_ArrayOfCharacters {
    public static void main(String[] args) {
        String word = "JavaScript";

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }
}
