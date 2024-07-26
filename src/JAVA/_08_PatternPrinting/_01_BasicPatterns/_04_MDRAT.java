package JAVA._08_PatternPrinting._01_BasicPatterns;

public class _04_MDRAT {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1 ; i<=n ; i++){
            for(int s=1 ; s<=i-1 ; s++){
                System.out.print("  ");
            }
            for(int j=n ; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
