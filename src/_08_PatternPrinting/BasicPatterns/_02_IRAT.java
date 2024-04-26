package _08_PatternPrinting.BasicPatterns;
public class _02_IRAT {
    public static void main(String[] args) {
        int n=5;

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n+1)-i ; j++){
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
