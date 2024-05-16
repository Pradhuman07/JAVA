package _08_PatternPrinting._05_CT;
public class _07_M 
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=0 ; r<n ; r++)
        {
            for(int c=0 ; c<n-r ; c++)
            {
                System.out.print("* ");
            }

            for(int s=0 ; s<r ; s++)
            {
                System.out.print("  ");
            }

            for(int s2=0 ; s2<r ; s2++ )
            {
                System.out.print("  ");
            }

            for(int c2=0 ; c2<n-r ; c2++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// * * * * *    * * * * * 
// * * * * s    s * * * * 
// * * * s s +  s * * * * 
// * * s s s    s s s * * 
// * s s s s    s s s s * 

// M is a combination of 2 decreasing stars with 2 spaces 