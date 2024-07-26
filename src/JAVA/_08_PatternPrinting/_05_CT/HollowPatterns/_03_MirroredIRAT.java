package JAVA._08_PatternPrinting._05_CT.HollowPatterns;
public class _03_MirroredIRAT 
{                           /*
.  .  .  .  15
.  .  .  24 25
.  .  33    35
.  42       45
51 52 53 54 55              */
    public static void main(String[] args) 
    {
        for(int r=1 ; r<=5 ; r++)
        {
            for(int c=1 ; c<=5 ; c++)
            {
                if(r==5 || c==5 || (r+c==6))
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


