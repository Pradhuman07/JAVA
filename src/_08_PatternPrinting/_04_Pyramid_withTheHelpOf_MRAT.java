package _08_PatternPrinting;

public class _04_Pyramid_withTheHelpOf_MRAT {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1 ; i<=n ; i++){
            for(int s=1 ; s<=n-i ; s++){
                System.out.print(" ");   //Force 10N se 5N krdia to * last tk na jakr middle/center pr aagye
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}