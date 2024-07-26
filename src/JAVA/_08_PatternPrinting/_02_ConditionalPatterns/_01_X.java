package JAVA._08_PatternPrinting._02_ConditionalPatterns;

public class _01_X {
    public static void main(String[] args) {
        int n = 5;

        //Rectangle Ka code likho aur fir condition lgado

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if( i==j || (i+j)==(n+1) ) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

//11 12 13 14 15            11              15
//21 22 23 24 25                22      24
//31 32 33 34 35    ==              33
//41 42 43 44 45                42      44
//51 52 53 54 55            51               55


