package _10_Method;
public class ArmstrongNumber {    // 153 = 1^3 + 5^3 + 3^3 ?
    public static int cube(int n){
        int cube = (int)Math.pow(n,3);
        return cube;
    }
    public static void main(String[] args) {
        int n = 153;
        int dup = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum = sum + cube(rem);
            n/=10;
        }
        n=dup;
        System.out.println(n==sum);
    }
}