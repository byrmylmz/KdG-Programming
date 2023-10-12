package Week3;

public class Ex_03_05_Factorial {
    public static void main(String[] arg){
       int i=1;
       while(i<20) {
           int result = 1;
           for (int j = 1; j <= i; j++) {
               result = result * j;

           }
           System.out.println(result);
           i++;
       }


//        int b=1;
//        do{
//            System.out.println(b++);
//        }while(b<5);


        //1*2*3

//        int i =5;
//        while( i<20){
//            //5
//
//            int result;
//            for(int j=1,k=1; j<=i; j++){
//
//                System.out.println(j);
//            }
//          i++;
//
//        }

//        while(number<=0){
//            number++;
//
//            System.out.println(1);
//        }
    }
}
