package _05_WhileLoop.PractiseSession;
public class FibbonaciSeries {
    public static void main(String[] args) {

//        Q.Print the Fibonacci Series up to 10 terms
//              0,1,1,2,3,5,8,13,21,34

        int n = 10;

        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        int third;

        for (int i = 1; i <= (n - 2); i++) {   //basically loop ko 8 bar dodana h
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        } 
    }
}
