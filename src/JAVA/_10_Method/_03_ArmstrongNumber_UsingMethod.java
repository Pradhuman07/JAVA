package JAVA._10_Method;
public class _03_ArmstrongNumber_UsingMethod {    // 153 = 1^3 + 5^3 + 3^3 = 153  //1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634

    public static int powerCalculate(int num , int raisePower){
        int power = (int)Math.pow(num,raisePower);
        return power;
    }

    public static void main(String[] args) {
        int num = 1634;   //153
        int raisePower = (int)Math.log10(num) + 1;

        int dup = num;

        int sum=0;

        while(num>0){
            int rem = num%10;
            sum = sum + powerCalculate(rem,raisePower);
            num/=10;
        }

        num=dup;

        System.out.println(num==sum);
    }
}