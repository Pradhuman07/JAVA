package _08_PatternPrinting._01_BasicPatterns;

public class _05_Triangle_using_MRAT {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1 ; i<=n ; i++){
            for(int s=n ; s>i ; s--){
               System.out.print(" ");   //"  " --> " " || Force 10N se 5N krdia to * last tk na jakr middle/center pr aagye
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}