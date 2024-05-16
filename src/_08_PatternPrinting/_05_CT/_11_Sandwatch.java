package _08_PatternPrinting._05_CT;
public class _11_Sandwatch 
{
    public static void main(String[] args) 
    {
        int n=5;
        
        for(int r=0 ; r<n ; r++)             //Ulta Pyramid
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

            System.out.println();
        }   
        
        
        
        for(int r=1 ; r<n ; r++)                //Seedha pyramid   //r=1 in order to keep only one star in the middle
        {
            for(int s=0 ; s<n-r-1 ; s++)        //5-1-1=3
            {
                System.out.print("  ");
            }

            for(int c=0 ; c<=r ; c++)
            {
                System.out.print("* ");
            }

            for(int c=0 ; c<r ; c++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// * * * * *   * * * *
// s * * * *   * * * s
// s s * * * + * * s s
// s s s * *   * s s s
// s s s s *   s s s s

                                // s s s s *   s s s s
// s s s * *   * s s s
// s s * * * + * * s s
// s * * * *   * * * s
// * * * * *   * * * *

//Ulta Pyramid + Seedha Pyramid