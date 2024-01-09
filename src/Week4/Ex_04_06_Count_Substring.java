package Week4;

public class Ex_04_06_Count_Substring {
    public static void main(String[] args) {
    StringBuilder string = new StringBuilder("The more you learn, the less you know.");

        StringBuilder sb =string;
        int count =0;
        while(sb.indexOf("ou") !=-1){
            count++;
            System.out.println(sb.indexOf("ou"));
            int index = sb.indexOf("ou");
            sb.setCharAt(index,' ');
        }
        System.out.println(count);
    }
}
