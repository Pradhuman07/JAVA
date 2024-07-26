package JAVA._08_PatternPrinting._05_CT;
public class _10_UltaPyramid 
{
    public static void main(String[] args) 
    { 
        int n=5;
        
        for(int r=0 ; r<n ; r++)
        {
            for(int s=0 ; s<r ; s++)
            {
                System.out.print("  ");
            }
            
            for(int c=0 ; c<n-r ; c++)
            {
                System.out.print("* ");
            }
            
            for(int c2=0 ; c2<n-r-1 ; c2++)
            {
                System.out.print("* ");
            }
            
            // for(int s=0 ; s<r ; s++)
            // {
            //     System.out.print("  ");      //doesn't matter
            // }                    

            System.out.println();
        }
    }
}

// * * * * *   * * * *
// s * * * *   * * * s
// s s * * * + * * s s
// s s s * *   * s s s
// s s s s *   s s s s