package DSA._03_Recursion;
public class _03_Print_1toN {

    public static void print_1toN(int n){
        if(n==0) return;
        print_1toN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print_1toN(5);
    }
}