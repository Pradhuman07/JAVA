//Math is a Class which is present inside the java.lang.Math; library
//floor,sqrt,max,min,pow etc. are its method i.e present inside the Math class

//java.lang.Math class is a built-in class , No need to import
//It provides mathematical functions and constants for mathematical operations.


//    --Math.floor(double a) - Returns the nearest lower whole number
//    --Math.ceil(double a) - Returns the nearest higher whole number
//    --Math.round(double a) - Returns the rounded off value  Note:- 2.5=3

//    --Math.sqrt(double a) - Returns the square root of the given number
//    --Math.cbrt(double a) - Returns the cube root of the number

//    --Math.max(double a, double b) - Returns the greater between a and b
//    --Math.min(double a, double b) - Returns the smaller between a and b
//    --Math.pow(double a, double b) - Returns a raised to the power of b

//    --Math.abs(int a) - Returns the unsigned value
//    --Math.PI,   - Exact value of Pi

//    --( (int) Math.log10(n) + 1)  - For counting the no. of digits of n

package _02_Math;
import java.lang.Math;   //built in class h to auto import.
public class AllMathFunctions {
    public static void main(String[] args) {

        System.out.println(Math.floor(5.3));
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.round(5.5));

        System.out.println(Math.sqrt(16.39));
        System.out.println(Math.cbrt(8.39));

        System.out.println(Math.max(-5.3,-6.1));
        System.out.println(Math.min(5.3,6.1));

        System.out.println(Math.max(Math.max(3,1),2));

        System.out.println(Math.pow(5,2.1));

        System.out.println(Math.abs(2-7));  //5
        System.out.println(Math.PI);

        System.out.println((int)Math.log10(1234) + 1);   //no.of digits
    }
}

