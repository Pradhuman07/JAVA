//Strong number --> 145 = 1! + 4! + 5! = 145
package JAVA._10_Method;
public class _01_StrongNumber {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1 ; i<=n ; i++) fact*=i;
        return fact;
    }

    public static void main(String[] args) {

        int n = 145;
        int dup = n;
        int sum=0;

        while(n>0){
            int lastDigit = n%10;
            sum += factorial(lastDigit);
            n/=10;
        }

        System.out.println(sum==dup? "Strong" : "Not Strong");
    }
}
