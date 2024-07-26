package JAVA._08_PatternPrinting._05_CT.HollowPatterns;
public class _02_IRAT
{
    public static void main(String[] args) 
    {
        int n=5;   //take user input

        for(int r=1 ; r<=n ; r++)      
        {
            for(int c=1 ; c<=r ; c++)
            {
                if(c==1 || r==n || r==c)
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

// 11
// 21 22 
// 31   33 
// 41      44
// 51 52 53 54 55