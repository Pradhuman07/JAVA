package JAVA._08_PatternPrinting._05_CT.HollowPatterns;
// 11 12 13 14 15
//   22      24
//       33
//    42    44
// 51 52 53 54 55  
  
public class _07_Sandwatch 
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=1 ; r<=n ;r++)
        {
            for(int c=1 ; c<=n ; c++)
            {
                if( r==1 || r==n || r==c || (r+c)==(n+1) )
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
