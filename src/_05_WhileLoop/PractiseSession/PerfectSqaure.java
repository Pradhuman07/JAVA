package _05_WhileLoop.PractiseSession;

public class PerfectSqaure {
    public static void main(String[] args) {

        int n = 25;

        double x = Math.sqrt(n);
        double y = Math.floor(x);
        System.out.println(x == y ? "Perfect" : "Not Perfect");

        int a = (int)Math.sqrt(n);
        System.out.println(a*a == n ? "Perfect" : "Not Perfect");

        boolean flag=false;
        for (int i = 1; i <= (n/2); i++) {
            if (i * i == n) {
                flag = true;   //sout("Perfevt") krdoge to bar bar aaega
                break;
            }
        }

        System.out.println(flag? "Perfect" : "Not Perfect ");
    }
}
