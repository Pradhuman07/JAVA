//Strong number --> 145 = 1! + 4! + 5! = 145
package _10_Method;
public class StrongNumber {
    public static int fact(int n){
        int fact = 1;
        while(n>=1){
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {

        int n = 145;
        int dup = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum += fact(rem);
            n/=10;
        }
        System.out.println(sum==dup? "Strong" : "Not Strong");
    }
}
