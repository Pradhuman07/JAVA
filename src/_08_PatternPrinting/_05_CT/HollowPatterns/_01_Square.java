package _08_PatternPrinting._05_CT.HollowPatterns;

public class _01_Square
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=1; r<=n ;r++)
    {
        for(int c=1; c<=n ; c++)
        {
            if(r==1 || r==n || c==1 || c==n)
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

// 11 12 13 14 15 
// 21          25
// 31          35
// 41          45
// 51 52 53 54 55