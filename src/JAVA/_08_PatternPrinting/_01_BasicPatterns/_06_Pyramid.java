package JAVA._08_PatternPrinting._01_BasicPatterns;

public class _06_Pyramid {
    public static void main(String[] args) {
        int n=5 ;

        for(int i=1 ; i<=n ; i++){
            for(int s=n ; s>i ; s--){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
