package _10_Method;
public class SpecialNumber {
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 109;
        while(n>9){
            n = sumOfDigits(n);
        }
        System.out.println(n==1);
    }
}
//If the sum of digits of a number is resolved to 1(single digit 1-9 therefore if >9 again do the sum of digits) then it is a Special Number
//n>9 bcoz we want single digit kyoki sum of digits krte aarhe h