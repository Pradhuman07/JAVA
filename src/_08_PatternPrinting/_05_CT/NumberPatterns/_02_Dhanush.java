package _08_PatternPrinting._05_CT.NumberPatterns;

public class _02_Dhanush 
{
    public static void main(String[] args) 
    {
        int n=4;

        for(int r=1,X=1 ; r<=n ; r++,X+=2)
        {
            for(int c=1; c<=r ; c++)
            {
                System.out.print(X + " ");
            }

            System.out.println();
        }

        for(int r=1,X=5 ; r<=n ; r++,X-=2)
        {
            for(int c=1; c<=n-r ; c++)
            {
                System.out.print(X + " ");
            }

            System.out.println();
        }
        
    }
}
