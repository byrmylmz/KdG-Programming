package Week3;

public class Ex_03_07_Hexadecimal {
    public static void main(String[] arg) {
        int j=1;
        char ch='A';
        for (int i = 0; i < 16; i++) {
            if(i==10){j=0;}
            System.out.println((i < 10) ? i +" " : ch++ +"");
            j++;
        }
    }
}
