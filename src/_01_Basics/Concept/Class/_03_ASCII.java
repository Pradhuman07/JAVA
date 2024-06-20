//A=65 , a=97 , 0=48 no , '0' = 48;

//Note jb bhi character mein Arithmetic Operation krte h to character automatically integer ASCII value mein convert ho jata h

package _01_Basics.Concept.Class;

public class _03_ASCII {
    public static void main(String[] args) {

        System.out.println( 'a' > 'A' );   //true

        int x ='a';   //is same as x = 97
        System.out.println(x); // 97 aayega
        System.out.println("x = " + ++x); // 98 aayega a nhi aayega kyoki int h

        char ch = 'a';
        System.out.println("ch = " + ++ch); // b aayega ab //Note:- arithmetic + nhi h wo concatenation + h , therefore no ASCII conversion

        System.out.println(ch + ch);   //b=98 therefore 98+98=196 ...since arithmetic operation horha therefore char converted into ASCII integer

        //Note idr no. aayega kyoki jaise hi character mein Arithmetic Operation krte h to character automatically integer ASCII value mein convert ho jata h

        System.out.println(ch);     //b
        System.out.println(++ch);   //c
        System.out.println(ch++);   //c .. now ch = d

        System.out.println(+ch);  //100..since arithmetic + h wo (d=100)
        System.out.println(ch);   //d .. character ko convert thodi na krdia tha hmesha ke liye int mein

        System.out.println((int)'A');   //65
        System.out.println((char)49);   //1
    }
}