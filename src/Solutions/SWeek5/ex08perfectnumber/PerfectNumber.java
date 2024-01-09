package Solutions.SWeek5.ex08perfectnumber;

public class PerfectNumber {
    public String getPerfect(int number) {
        int sumFactors = 1;
        StringBuilder factors = new StringBuilder("1 ");

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sumFactors += i;
                factors.append(i).append(" ");
            }
        }

        return sumFactors == number ? factors.toString() : null;
    }

}
