package DSA._03_Recursion;
public class _02_Print_Nto1 {

    public static void printNumbers(int n){
        if(n==0) return;
        System.out.println(n);
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }

}
