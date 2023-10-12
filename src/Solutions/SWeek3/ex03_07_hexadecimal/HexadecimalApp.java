package Solutions.SWeek3.ex03_07_hexadecimal;

public class HexadecimalApp {
    
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        final char LETTER_A = 'A';
        for (int i = 0; i < 6; i++) {
            System.out.print((char) (LETTER_A + i) + " ");
        }
        System.out.println();
        
        for (char letter = LETTER_A; letter < LETTER_A + 6; letter++) {
            System.out.print(letter + " ");
        }
    }  // main()
    
}  // class

