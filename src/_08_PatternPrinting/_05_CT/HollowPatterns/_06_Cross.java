package _08_PatternPrinting._05_CT.HollowPatterns;
// 11          15
//   22      24
//       33
//    42    44
// 51          55      
public class _06_Cross 
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=1 ; r<=n ;r++)
        {
            for(int c=1 ; c<=n ; c++)
            {
                if(r==c || r+c==6)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }    
}
