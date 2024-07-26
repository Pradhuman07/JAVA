package JAVA._08_PatternPrinting._05_CT.HollowPatterns;
public class _04_Pyramid 
{
    public static void main(String[] args) 
    {
        for(int r=1 ; r<=5 ; r++)
        {
            for(int c=1 ; c<=9 ; c++)
            {
                if((r+c)==6 || r==5 )
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

// . . . .     15 . . . .      
// . . .   24 25 26 . . .
// . .  33 34 35 36 37 . .
// . 42 43 44 45 46 47 48 .
// 51 52 53 54 55 56 57 58 59

// total 5 rows 9 columns

// r+c == 6
// r==5
// r+c == 6,8,10,12,14

// + x sandwatch 3 remaining