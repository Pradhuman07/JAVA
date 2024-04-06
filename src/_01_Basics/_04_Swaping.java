package _01_Basics;
public class _04_Swaping {
    public static void main(String[] args) {

        //1.Using Temporary Variable

        int a=4,b=7;
        int t;

        t=a;     //t=4
        a=b;     //a=7      // bijli bnana h
        b=t;     //b=4

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.Using Arithmatic Operations

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