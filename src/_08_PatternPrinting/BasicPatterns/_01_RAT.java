package _08_PatternPrinting.BasicPatterns;
public class _01_RAT {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1;i<=n ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}