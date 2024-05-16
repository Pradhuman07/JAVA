package _08_PatternPrinting._05_CT.HollowPatterns;
// package Java._08_PatternPrinting;

public class _08_Swaastik 
{
    public static void main(String[] args) 
    {
        int n=9;
        int m=n/2;

        for(int r=1 ; r<=n ; r++)
        {
            for(int c=1 ; c<=n ; c++)
            {
                if( (c==m+1 || r==m+1) || (r==1 && c>m+1) || (c==1 && r<=m) || (c==n && r>m+1) || (r==n && c<=m) )
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

// 11    13 14 15
// 21    23
// 31 32 33 34 35
//       43    45
// 51 52 53    55