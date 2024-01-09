package Solutions.SWeek6;

public class A08_Split {
    public static void main(String[] args) {
        String text = "Java can be tricky at times";

        String[] words = text.split(" ");

        for (String word : words) {
            System.out.print("\"" + word + "\" ");
        }
    }
}
