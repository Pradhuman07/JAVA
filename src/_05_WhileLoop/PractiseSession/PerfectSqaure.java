package _05_WhileLoop.PractiseSession;

public class PerfectSqaure {
    public static void main(String[] args) {

        int n = 27;
        double x = Math.sqrt(n);   //5.19
        double y = Math.floor(x);  //5.0
        System.out.println(x == y ? "Perfect" : "Not Perfect");

        n=16;
        boolean flag=false;
        for (int i = 1; i <= (n/2); i++) {       //1-8
            if (i * i == n) {
                flag = true;   //sout("Perfect") krdoge to bar bar aaega
                break;
            }
        }
        System.out.println(flag? "Perfect" : "Not Perfect ");
    }
}
