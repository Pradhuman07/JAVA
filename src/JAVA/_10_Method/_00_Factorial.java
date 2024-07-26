package JAVA._10_Method;
public class _00_Factorial {

    public static int factorial(int n){
        int fact = 1;

        for(int i=1; i<=n ; i++)
            fact*=i;

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));         //readibilty bdhadi implementation chupa lia
        System.out.println(factorial(5));
        System.out.println(_00_Factorial.factorial(6));
    }

}

// static ones are accessed by class name but not mandotory if in same class
// non static ones are accessed by object name..and are mandotory everywhere
// Note: to access in another class make the method public
