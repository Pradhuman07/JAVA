package _08_PatternPrinting._01_BasicPatterns;
public class _01_IRAT {
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
