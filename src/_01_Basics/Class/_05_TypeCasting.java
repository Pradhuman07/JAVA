package _01_Basics.Class;
public class _05_TypeCasting {
    public static void main(String[] args) {

//                      1.Implicit or Widening:-
//      Order:-    byte->short->int->long->float->double
//                         char->int (ASCII)
            byte a = 5;
            int x = a;   //implicit means khudse/automatic/internally

            char ch = 'a';
            int chh = ch;
            System.out.println(chh);   //97

//-------------------------------------------------------

//                    2.Explicit or Narrowing:
//      Order:-   byte<-short<-int<-long<-float<-double
//                        char<-int

            int m = 5;
            byte z = (byte) m;
            System.out.println(z);  //5

            System.out.println((byte)128);   //-128
            System.out.println((byte)129);   //-127
            System.out.println((byte)130);   //-126
            System.out.println((byte)-128);  //-128
            System.out.println((byte)-129);  //+127

            int chhh = 97;
            char chhhh = (char)chhh;
            System.out.println(chhhh);   //a

            System.out.println((char)65);  //A    //ASCII value 65 pr konsa character betha hua h
            System.out.println((char)48);  //'0' no 0

            //Remember 0!=48 , '0' = 48  .

            System.out.println((char)0);  //emoji
            System.out.println((int)'0');  //48    .. '0' ki ascii value
            System.out.println((char)48);  //'0'   ..  48 ascii value pr character

//            System.out.println((int)'48');  //48    error


//-------------------------------------------------------

//#Absurd Value...Data Loss:-

            int i = 128;
            byte j = (byte) i;
            System.out.println(j);   //-128

        //Number Line Circle Repition

            int p=129,q=130,r=131;
            byte p2 = (byte)p;    //-127
            byte q2 = (byte)q;    //-126
            byte r2 = (byte)r;    //-125

            System.out.println(p2);
            System.out.println(q2);
            System.out.println(r2);
    }
}