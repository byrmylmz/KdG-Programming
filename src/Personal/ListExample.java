package Personal;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("bayram");
        stringList.add("yilmaz");


        System.out.println(stringList.get(0));

        for (String s:
             stringList) {
            System.out.println(s);
        }


    }
}
