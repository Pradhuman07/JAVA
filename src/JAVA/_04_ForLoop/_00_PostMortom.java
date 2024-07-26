package JAVA._04_ForLoop;

public class _00_PostMortom {
    public static void main(String[] args) {
//        ------------------------------------------
//          for(int i = 1 ; i<4 ;i++) System.out.println(i);

//        ------------------------------------------
//          for(;;); //shortest for loop Syntax         //infinity

//        ------------------------------------------
//        for(i = 3; i<=5 ; i++) {
//            System.out.println(i);  //3,4,5
//        }
//        System.out.println("Outside loop " + i);  //Error since i is          local variable of for body so not accesible outside the for loop
//        ----------------------------------------------
//        int i = 1;
//        for(i = 3; i<=5 ; i++) {
//            System.out.println(i);  //3,4,5
//        }
//        System.out.println("Outside loop " + i);  //6 ,Since i is             globally declared so it is accesible even outside the for loop

//        ------------------------------------------
//        int i=6;
//        for(char ch = 45; i<14 ; i+=2)
//            System.out.println(i);  //6,8,10,12
//
//        ------------------------------------------
//        int i=1;
//        for(System.out.println("Hello"); i<20 ; i++)
//            System.out.println(i);  //Hello,1,2,...,19

//        ------------------------------------------
//        int i=1;
//        for(System.out.println("Hello"); i<30 ; System.out.println("Hello"))
//             System.out.println(i);  //hello,then infinite times 1 hello 1 hello
//        ------------------------------------------
//        int i=20;
//        for(; i<30 ; ) System.out.println(i); // 20,20,20....infinity

//        ------------------------------------------
//        for(int i=1 ; i>0 ; )
//        System.out.println(i);
//
//        System.out.println("Hello");   //compiler yha tk kbi aa hi nhi paega pr error nhi dega kyoki he does not know for sure that i>0 always true

//        ------------------------------------------
//        for(byte j = -120 ; true ; j--)
//          System.out.println(j);

//        System.out.println("Hello");   //Error:- Unreachable statement //true means true always for sure

//        ------------------------------------------
//        for(int a = 1 ; a<4 ; a++);{
//            System.out.println("Hii");   //Only 1 time Hii    #See that above ';'
//        }

//        ------------------------------------------
//        for(int k = 1 ; true ; k++) System.out.println(k);
//        System.out.println("Hello"); //Unreachable statement//

//        ------------------------------------------

//        for(int k = 1 ; k!=0 ;) System.out.println(k);
//        System.out.println("Hello");

        //Ab Unreachable nhi aayega kyoki java compile time pr ye nhi bata skta ki this condition is always true to wo loop ko doda hi dega but agr hm true likh dete to java compile time pe hi bata deta
//        ------------------------------------------
//        for (int x = 0; false ; x++) ;   //syntax error..loop does not take false

//        ------------------------------------------
//            int a=100;
//            for ( ; a<=100 ; a/=10){
//                System.out.println(a);   //Infinite Loop
//            }
//            System.out.println("Reaching? No ..but No error");

//        ------------------------------------------

//            int a=100;
//            for ( ; true ; a/=10){
//                System.out.println(a);   //Infinite Loop
//            }
//            System.out.println("Reaching? No, and ERROR HERE BCOZ COMPILER HERE is 100% sure that code is unreachable");

//        ------------------------------------------

//        for(;;);                              //Infinite Loop...Java Knows this very well
//        System.out.println("jfkdshfkj");      //Unreachable Code Error

//        ------------------------------------------
//        byte i = 1;
//        for (i=1; i>0 ; i++) {
//            System.out.println(i);      //"Finite Loop" ...Since in Byte 127+1 = -128 which is not >0
//        }
//        System.out.println("Outside the Loop " + i);  // see i=-128 where the loops stopped

    }
}
