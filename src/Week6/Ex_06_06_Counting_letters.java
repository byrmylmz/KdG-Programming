package Week6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_06_06_Counting_letters {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("sentence:");
        String sentence = keyboard.nextLine();
        char[] ch = sentence.toCharArray();

        int[] count = new int[26];

        char[] characters = new char[26];
        int j=0;
        for (int i = 97; i<=122 ; i++) {
            characters[j]=(char) i;
            j++;
        }

        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
            count[(int)sentence.charAt(i)]++;
        }
    }

//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("sentence:");
//        String sentence = keyboard.nextLine();
//        char[] ch = sentence.toCharArray();
//
//        int[] count = new int[26];
//
//        System.out.println(Arrays.toString(ch));
//        for (char letter :
//                ch) {
//            switch (letter){
//                case 'a': count[0]++; break;
//                case 'b': count[1]++; break;
//                case 'c': count[2]++; break;
//                case 'd': count[3]++; break;
//                case 'e': count[4]++; break;
//                case 'f': count[5]++; break;
//                case 'g': count[6]++; break;
//                case 'h': count[7]++; break;
//                case 'i': count[8]++; break;
//                case 'j': count[9]++; break;
//                case 'k': count[10]++; break;
//                case 'l': count[11]++; break;
//                case 'm': count[12]++; break;
//                case 'n': count[13]++; break;
//                case 'o': count[14]++; break;
//                case 'p': count[15]++; break;
//                case 'q': count[16]++; break;
//                case 'r': count[17]++; break;
//                case 's': count[18]++; break;
//                case 't': count[19]++; break;
//                case 'u': count[20]++; break;
//                case 'v': count[21]++; break;
//                case 'w': count[22]++; break;
//                case 'x': count[23]++; break;
//                case 'y': count[24]++; break;
//                case 'z': count[25]++; break;
//            }
//        }
//
//        System.out.println(Arrays.toString(count));
//        char[] characters = new char[26];
//        int j=0;
//        for (int i = 97; i<=122 ; i++) {
//
//            characters[j]=(char) i;
//            j++;
//
//        }
//        System.out.println(Arrays.toString(characters));
//
//        for (int i = 0; i < count.length; i++) {
//            System.out.printf("%d %c",count[i],characters[i]);
//        }
//
//    }
}


