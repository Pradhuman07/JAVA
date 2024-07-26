package JAVA._05_WhileLoop.EQ_34_to_39;
public class EQ38_UsingMethod {

    private static int factorialOf(int n) {
        int factorial = 1;
        for(int i=1 ; i<=n ; i++)
            factorial *= i;
        return factorial;
    }

    public static void main(String[] args) {
        int n = 145;
        int dup = n;
        int sumOfFactorial = 0;

        while(n>0){
            sumOfFactorial = sumOfFactorial + factorialOf(n%10);
            n/=10;
        }

        System.out.println(sumOfFactorial==dup ? "Strong" : "Not Strong");
    }
}
