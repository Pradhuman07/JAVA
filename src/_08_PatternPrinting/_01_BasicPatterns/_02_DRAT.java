package _08_PatternPrinting._01_BasicPatterns;
public class _02_DRAT {
    public static void main(String[] args) {
        int n=5;

        for(int i=1 ; i<=n ; i++){
            for(int j=n; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
               //Another Method  (Regressive Way)

//        for(int i=n ; i>=1 ; i--){
//            for(int j=1 ; j<=i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
