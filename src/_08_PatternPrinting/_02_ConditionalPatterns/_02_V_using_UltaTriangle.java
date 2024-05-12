package _08_PatternPrinting._02_ConditionalPatterns;

public class _02_V_using_UltaTriangle {
    public static void main(String[] args) {

        //sbse phle ulta triangle bnao
        //ulta triangle bnaega whi triangle wali trick se
        //MDRAT bnao fir force ko aadha krdo

        int n = 5;
        for(int i=1 ; i<=n ; i++){
            for(int s=1 ; s<i ; s++){
                System.out.print(" ");   //Only one space...force halved
            }
            for(int j=n ; j>=i ; j--){
                if(j==n || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}