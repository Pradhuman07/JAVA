package JAVA._08_PatternPrinting._05_CT;
public class _14_Diamond 
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=1 ; r<=n ; r++)          //upper half part
        {
            for(int s=1 ; s<=n-r ; s++)
            {
               System.out.print("  "); 
            }
            for(int c=1 ; c<=r ; c++)
            {
                System.out.print("* ");
            }
            for(int c=1 ; c<r ; c++)        //bs cond se = hata dia
            {
                System.out.print("* ");
            }

            System.out.println();           //upper half part completed
        }

        for(int r=1 ; r<=n-1 ; r++)
        {
            for(int s=1 ; s<=r ; s++)
            {
                System.out.print("  ");
            }
            for(int c=1 ; c<=n-r ; c++)
            {
                System.out.print("* ");
            }
            for(int c=1 ; c<n-r ; c++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// s s s s *   
// s s s * *   * 
// s s * * *   * * 
// s * * * *   * * * 
// * * * * *   * * * *

// s * * * *   * * *
// s s * * *   * *
// s s s * *   * 
// s s s s *   