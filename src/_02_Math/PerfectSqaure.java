package _02_Math;

public class PerfectSqaure {
    public static void main(String[] args) {

        int n = 27;
        double x = Math.sqrt(n);   //5.19
        double y = Math.floor(x);  //5.0
        System.out.println(x == y ? "Perfect" : "Not Perfect");

        n=16;
        boolean flag=false;
        for (int i = 1; i*i<=n; i++) {       //1-8
            if (i * i == n) {
                flag = true;
                break;          //break is must...without it wrong o/p
            }
        }
        System.out.println(flag ? "Perfect" : "Not Perfect ");
    }
}
