package _05_WhileLoop.EQ_34_to_39;

public class Factorial {
    public static void main(String[] args) {
        int n=4;

        int fact = 1;
        for(int i=n ; i>=1 ; i--){
            fact = fact*i;
        }
        System.out.println(fact);

        fact = 1;
        while (n>=1){
            fact = fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
