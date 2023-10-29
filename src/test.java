import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

public class test {
    public static void main(String[] args) {
        String str = "-31";
        byte[] byteArr = str.getBytes();
        System.out.println(Arrays.toString(byteArr));

        byte[] by = new byte[31];
        // byte[] elemanlarını yazdır
        System.out.println("String to byte array: " + Arrays.toString(byteArr));
        byte[] arr = new byte[4];
        int newIndex = 0;
        for (int i = 0; i < byteArr.length; i++) {
            if (byteArr[i] % 2 == 0) { // Add a condition to filter elements
                arr[newIndex] = byteArr[i];
                newIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
        String sarr= new String("e0");
        System.out.println(sarr);
    }
}
