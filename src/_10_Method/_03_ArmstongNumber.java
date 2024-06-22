package _10_Method;

public class _03_ArmstongNumber {
    public static void main(String[] args) {
        int num = 1634;   //153
        int raisePower = (int)Math.log10(num) + 1;

        int dup = num;

        int sum=0;

        while(num>0){
            int rem = num%10;
            sum = sum + (int)Math.pow(rem,raisePower);
            num/=10;
        }

        num=dup;

        System.out.println(num==sum);
    }
}
