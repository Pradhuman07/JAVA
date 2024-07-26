package DSA._03_Recursion;
public class _06_SoD {

    public static int sod(int n){
        if(n<=9) return n;
        return n%10 + sod(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sod(1234));
    }
}

//        int n = 1234;
//        int sum=0;
//        while(n>0){
//            sum+=n%10;
//            n/=10;
//        }
//        System.out.println(sum);