package _01_Basics.Class;
public class _05_TypeCasting {
    public static void main(String[] args) {

        //1.Implicit or Widening:-
//      Order:-    byte->short->int->long->float->double
//                         char->int (ASCII)
            byte a = 5;
            int x = a;

//-------------------------------------------------------

        //2.Explicit or Narrowing:

//      Order:-   byte<-short<-int<-long<-float<-double
//                        short<-char<-int
            int m = 5;
            byte z = (byte) m;


//-------------------------------------------------------

//#Absurd Value...Data Loss:-

            int i = 128;
            byte j = (byte) i;
            System.out.println(j);

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

//Note : Shorthand operators do implicit conversion.
//byte b = 1;
//b=b+2; // error , 2 is int(all non-float by default int) so can’t store in byte
//b += 2; // works perfectly as += did not do implicit conversion