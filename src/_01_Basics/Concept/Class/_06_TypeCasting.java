package _01_Basics.Concept.Class;
public class _06_TypeCasting {
    public static void main(String[] args) {
        byte a = 4;
        byte b = 6;
//      byte c = (a+b);   By default arithmetic operations on byte,short and char operands result in an int.
        byte c = (byte)(a+b);

//The error is coming because the result of the expression is of type int, not byte.
//By default arithmetic operations on byte,short and char operands result in an int.
//To resolve this error, you need to explicitly cast the result back to byte.

//Note :- Shorthand Operators do Implicit Conversion. (khudse/automatic/internally)

        byte x = 1;
//      x = x + 2;   // error , 2 is int(all non-float by default int) so can’t store x+2 in byte ..moreover By default arithmetic operations on byte,short and char operands result in an int.
        x+=1;        //works perfectly as += do implicit conversion.
    }
}