package _08_PatternPrinting._05_CT.HollowPatterns;
public class _05_Plus 
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=1 ; r<=n ;r++)
        {
            for(int c=1 ; c<=n ; c++)
            {
                if(r==3 || c==3)
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

//       13
//       23
// 31 32 33 34 35
//       43
//       53