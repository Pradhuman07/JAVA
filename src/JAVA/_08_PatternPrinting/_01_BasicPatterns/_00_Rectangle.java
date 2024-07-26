package JAVA._08_PatternPrinting._01_BasicPatterns;
public class _00_Rectangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//i = row     , n= no. of rows
//j = column  , m = no. of column