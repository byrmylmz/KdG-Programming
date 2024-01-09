package Solutions.SWeek5.ex08perfectnumber;
public class TestPerfectNumber {
    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();

        for (int i = 2; i < 10000; i++) {
                String perfect = perfectNumber.getPerfect(i);
            if (perfect != null) {
                System.out.println(i + " --> " + perfect);
            }
        }
    }
}
