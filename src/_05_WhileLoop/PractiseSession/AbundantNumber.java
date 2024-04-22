package _05_WhileLoop.PractiseSession;

public class AbundantNumber {  //Proper divisors/factors ka sum > No.
    public static void main(String[] args) {
        int n=12;   //1+2+3+4+6 > 12
        int dup = n;

        int sum=0;

        for(int i=1; i<n ; i++) {  //i<=n/2 lo to reduce T.C
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum>dup ? "Abundant" : "Not Abundant");
    }
}
