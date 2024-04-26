package _08_PatternPrinting.Conditionals;

public class _02_V_using_UltaTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i=n ; i>=1 ; i--){
            for(int s=1 ; s<=n-i ; s++){
                System.out.print(" ");   //Only one space...force halved
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
