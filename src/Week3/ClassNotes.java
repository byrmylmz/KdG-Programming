package Week3;

public class ClassNotes {

    public static void main(String[] args){

//        int counter= 10;
//        while (true) {
//            System.out.println (counter++);
//            if(counter>100){break;}
//        }
//
//        System.out.println("After a while");

//----------------------------------------------------------
//    int counter =0;
//    for(int i=0; i<10;++i)
//        System.out.println(i);
//----------------------------------------------------------

//        int i = 3;
//        int a = i++; // a = 3, i = 4
//        System.out.println(a);
//        System.out.println(i);
//        int b = ++a; // b = 4, a = 4
//        System.out.println(b);
//        System.out.println(a);

//-----------------------------------------------------------
//        // initialize i
//        int i = 0;
//        System.out.println("Post-Increment");
//
//        // i values is incremented to 1 after returning
//        // current value i.e; 0
//        System.out.println(i++);
//
//        // initialized to 0
//        int j = 0;
//        System.out.println("Pre-Increment");
//
//        // j is incremented to 1 and then it's value is
//        // returned
//        System.out.println(++j);
//------------------------------------------------------------

//        int counter = 0;
//        while (++counter<10){
//            if(counter % 3 ==0){continue;}
//            System.out.println(counter + "");
//        }
//------------------------------------------------------------
            int counter =0;
            do{
                System.out.println(++counter + "");
            } while(counter<10);
    }
}
