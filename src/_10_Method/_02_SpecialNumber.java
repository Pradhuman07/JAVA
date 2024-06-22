//If the sum of digits of a number is resolved to 1 , then it is a Special Number.
package _10_Method;
public class _02_SpecialNumber {
    public static int sumOfDigits(int n){
        int sum=0;

        while(n>0){       //109 ki sum of digists nikaal rhe...10 aai   //10 ki SOD nikaal rhe...1 aai
            sum+=n%10;
            n/=10;
        }

        return sum;     //10     //1
    }

    public static void main(String[] args){
        int n = 109;

        while(n>9)                      //(n>9) means jb tk no. is double digit
            n=sumOfDigits(n);

        System.out.println(n==1);
    }
}