package Week4;

import java.util.Random;

public class SlidePlayGround {
    public static void main(String[] args) {
//        Random randomOne;
//        Random randomTwo;
//        randomOne = new Random(42);
//        randomTwo = randomOne;
//        System.out.println(randomOne.nextInt()+"randomone");
//        System.out.println(randomTwo.nextInt()+"randomtwo");


//        int random = generator.nextInt();

//        String name = "bayram";
//        String anotherName = "bayram";
//
//        System.out.println("name:" + name);
//        System.out.println("anothername:" + anotherName);
//
//
//        String thirdName = new String("bayram");
//        System.out.println(name == anotherName);
//
//        String sql = """
//                sdf
//                sdf
//                sdf
//                sdf
//                """;
//        System.out.println(sql);

//        String male = "john";
//        String female = "marry";
//        int amount = male.length();
//        System.out.println(female.charAt(3));
//        System.out.println(female.equals(male));
//        System.out.println(female.equals("marry"));
//        System.out.println(female.equalsIgnoreCase("marry"));
//        System.out.println(female.equals("Marry"));
//        System.out.println(male.compareTo(female));
//        System.out.println(male.compareTo("john"));
//
//        char ch = "bayram".charAt(2);
//        System.out.println(ch);
//
//        String first = "first";
//        String second = "second";
//
//        String third = first+second+"third";
//        System.out.println(third);
//        System.out.println(3 + 7 + " hello world " + 3 + 7);
//        System.out.println("bayram"+3+3);
//
//        String s1 = "abc";
//        s1.concat("bayram");// strings are immutable. when you perform concat a new string will be created instead modify the first one.
//        System.out.println(s1);// it will remain same after concat operation due to new string have created.
//
//        String s2 = s1.concat("def"); // here we create new string and assign the concat there to show you.
//        System.out.println(s2);
        String literalString = "stringLiteral";
        String objectString = new String("stringLitteral");
        objectString = "second";
        System.out.println(objectString);

        StringBuilder emptyBuilder = new StringBuilder("stringLiteral");

        StringBuilder spoon = new StringBuilder("spoon");
        StringBuilder fork = new StringBuilder();
        fork.append("f");
        fork.append("o");
        fork.append("r").append("k");
        System.out.println(spoon + " and " + fork);

        System.out.println(fork.reverse());






    }
}