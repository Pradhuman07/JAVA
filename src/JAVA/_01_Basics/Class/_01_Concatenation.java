package JAVA._01_Basics.Class;

public class _01_Concatenation {
    public static void main(String[] args) {
        int a = 4, b = 7;
        System.out.println("The sum is " + a + b);      //47
        System.out.println("The sum is " + (a + b));    //11
    }
}

//--Role of '+' operator between String & numbers:-
        //int + int = int - Arithmetic Addition
        //String + String = String - Concatenation
        //String + int = String - Concatenation