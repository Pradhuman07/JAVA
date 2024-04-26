package _08_PatternPrinting.BasicPatterns;

public class _04_MIRAT {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1 ; i<=n ; i++){
            for(int s=1 ; s<=i-1 ; s++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=(n+1)-i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
