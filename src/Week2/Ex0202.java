package Week2;

import static java.lang.Long.sum;

public class Ex0202 {

    public static void main(String[] arg){

//        // Part 1
//        int numberA = 20;
//        int numberB = 6;
//
//        long millionA = 2000000L;
//        long millionB = 2000000L;
//
//        Long sumAB = sum(millionB,millionA);
//
//        System.out.println(sumAB);
//
//        // Part 2
//
//        long a = 10000L;
//        long b = 10000L;
//
//        int result = (int) sum(a,b);
//        System.out.println(result);

        //part 3

        int first = 5;
        int second = 8;

        System.out.println(
               (first+second) + "\n"+
               (second-first) + "\n"+
               (second*first) + "\n"+
                ((double) first/second) + "\n"+
               (first%second) + "\n"

        );

        int result;

        result = ++first;

        System.out.println(result);

        result = first++;

        System.out.println(result);

        result = --second;
        System.out.println(result);

        result = second--;
        System.out.println(result);

    }
}

