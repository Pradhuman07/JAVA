//Math is a Class which is present inside the java.lang.Math library.
//floor,sqrt,max,min,pow etc. are its method i.e present inside the Math class

//java.lang.Math class is a built-in class , No need to import
//It provides mathematical functions and constants for mathematical operations.


//    --Math.floor(double a) - Returns the nearest lower whole number...RT = Double
//    --Math.ceil(double a) - Returns the nearest higher whole number...RT = Double
//    --Math.round(double a) - Returns the rounded off value  Note:- 2.5=3...RT = Integer

//    --Math.sqrt(double a) - Returns the square root of the given number...RT = Double
//    --Math.cbrt(double a) - Returns the cube root of the number...RT = Double

//    --Math.max(a , b) - Returns the greater between a and b   ...RT = bada DT out of (a and b)
//    --Math.min(a , b) - Returns the smaller between a and b   ...RT = bada DT out of (a and b)

//    --Math.pow(a , b) - Returns a raised to the power of b  ...RT = Double Always

//    --Math.abs(a-b) - Returns the unsigned value
//    --Math.PI,   - Exact value of Pi

//    --( (int) Math.log10(n) + 1)  - For counting the no. of digits of n

package JAVA._02_Math;
import java.lang.Math;   //built in class h to auto import.
public class AllMathFunctions {
    public static void main(String[] args) {

        System.out.println(Math.floor(5.3));   //5.0
        System.out.println(Math.ceil(5.3));    //6.0
        System.out.println(Math.round(5.5));   //6

        System.out.println(Math.sqrt(16.39));   //4.048..
        System.out.println(Math.cbrt(8.39));    //2.03..

        System.out.println(Math.max(-5.3,-6.1));    //-5.3
        System.out.println(Math.max(5,6));          //6
        System.out.println(Math.max(5.2,6));        //6.0
        System.out.println(Math.min(5.3,6.1));      //5.3

        System.out.println(Math.pow(5,2));      //25.0

        System.out.println(Math.abs(2-7));  //5
        System.out.println(Math.PI);

        System.out.println(Math.max(Math.max(3,1),2.0));   //3.0
        System.out.println((int)Math.log10(1234) + 1);   //no.of digits
        
//        int x = Math.sqrt(25);   //error
//        int y = Math.pow(5,2);   //error
          int z = (int)Math.pow(5,2);
    }
}

