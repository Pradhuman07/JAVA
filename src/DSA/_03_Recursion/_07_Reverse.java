package DSA._03_Recursion;
public class _07_Reverse{
    public static int reverse(int n,int rev){
        if(n==0) return rev;
        rev = rev*10 + n%10;
        return reverse(n/10,rev);
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234,0));
    }
}