package _01_Basics;

public class _05_TypeCasting {
    public static void main(String[] args) {

//1.Implicit or Widening:
            byte a = 5;
            int x = a;

//      Order:-    byte->short->int->long->float->double
//                         char->int (ASCII)

//-------------------------------------------------------//
//2.Explicit or Narrowing:

            int m = 5;
            byte z = (byte) m;

//      Order:-   byte<-short<-int<-long<-float<-double
//                        short<-char<-int

//-------------------------------------------------------//

//#Absurd Value...Data Loss:-

            int i = 128;
            byte j = (byte) i;
            System.out.println(j);

//-------------------------------------------------------//
        //Number Line Circle Repition

            int p=129,q=130,r=131;
            byte p2 = (byte) p;
            byte q2 = (byte) q;
            byte r2 = (byte) r;

            System.out.println(p2);
            System.out.println(q2);
            System.out.println(r2);
    }
}
