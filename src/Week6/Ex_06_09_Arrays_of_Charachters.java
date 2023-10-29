package Week6;

public class Ex_06_09_Arrays_of_Charachters {
    public static void main(String[] args) {
        String text = "javaScript";
        char[] textArray= text.toCharArray();
        for (char t :
                textArray) {
            System.out.print(" "+t+" ");
        }
    }
}
