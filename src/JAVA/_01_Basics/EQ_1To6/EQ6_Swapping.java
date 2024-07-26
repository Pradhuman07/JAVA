//6- Accept two numbers from user and swap their values
//Part 2 - Swap without using third variable
package JAVA._01_Basics.EQ_1To6;
public class EQ6_Swapping {
    public static void main(String[] args) {

        //1.Using Third Variable

        int a=4,b=7;
        int t;

        t=a;     //t=4
        a=b;     //a=7      // bijli bnana h
        b=t;     //b=4

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.Without using third variable

        a=4; b=7;

        a=a+b;      //a=11
        b=a-b;      //b=11-7
        a=a-b;      //a=11-4

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //3.Using Exor

        a=4; b=7;

        a=a^b;      //a=11
        b=a^b;      //b=11-7
        a=a^b;      //a=11-4

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
