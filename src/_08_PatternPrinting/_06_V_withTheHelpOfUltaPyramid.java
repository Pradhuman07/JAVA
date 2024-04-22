package _08_PatternPrinting;

public class _06_V_withTheHelpOfUltaPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i=n ; i>=1 ; i--){
            for(int s=1 ; s<=n-i ; s++){
                System.out.print(" ");   //Force 10N se 5N krdia to * last tk na jakr middle/center pr aagye
            }
            for(int j=1 ; j<=i ; j++){
                if(j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }    
}
