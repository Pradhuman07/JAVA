// 0=48 , A=65 ,a=97

//Note jb bhi character mein Arithmetic Operation krte h to character automatically integer ASCII value mein convert ho jata h

package _01_Basics;
public class _03_ASCII {
    public static void main(String[] args) {

        System.out.println( 'a' > 'A' );

        int x ='a';
        System.out.println(x); // 97 aayega
        System.out.println("x = " + ++x); // 98 aayega a nhi aayega kyoki int h

        char ch = 'a';
        System.out.println("ch = " + ++ch); // b aayega ab //note- arithmatic + nhi h wo , therfore no ASCII conversion

        System.out.println(ch + ch); // ch = 98 therfore 98+98  //since arithmatic operation horha therefore char converted into ASCII integer

        //Note idr no. aayega kyoki jaise hi character mein Arithmetic Operation krte h to character automatically integer ASCII value mein convert ho jata h

        System.out.println(ch);     //b
        System.out.println(++ch);   //c
        System.out.println(ch++);   //c

        System.out.println(+ch);  //99
        System.out.println(ch);   //c

    }
}
