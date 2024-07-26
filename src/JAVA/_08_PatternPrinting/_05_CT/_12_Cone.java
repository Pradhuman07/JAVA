package JAVA._08_PatternPrinting._05_CT;
public class _12_Cone 
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=0 ; r<n ; r++)
        {
            for(int s=0 ; s<n-r-1 ; s++)
            {
                System.out.print(" ");   //only one space and third loop removed..otherwise it is a pyramid
            }

            for(int c=0 ; c<=r ; c++)
            {
                System.out.print("* ");
            }

            // for(int c=0 ; c<r ; c++)
            // {
            //     System.out.print("* ");
            // }

            System.out.println();
        }
    }
}
