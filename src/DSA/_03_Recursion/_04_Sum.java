package DSA._03_Recursion;
public class _04_Sum {

    public static int sumN(int n){
        if(n==1) return n;
        return n + sumN(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumN(4));
    }
}

//        if(n==0) return 0;
//        if(n==1) return 1;