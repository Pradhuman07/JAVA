package JAVA._05_WhileLoop.PractiseSession;
public class AbundantNumber {
    public static void main(String[] args) {    //Proper divisors/factors ka sum > No.
        int n=12;      //1+2+3+4+6 > 12
        int sum=0;

        for(int i=1 ; i<=n/2 ; i++)    //i<n tha but i<=n/2 to reduce TC
            if (n % i == 0)
                sum += i;

        System.out.println(sum>n ? "Abundant" : "Not Abundant");
    }
}