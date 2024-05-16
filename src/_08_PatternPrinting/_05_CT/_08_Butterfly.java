package _08_PatternPrinting._05_CT;
public class _08_Butterfly 
{
    public static void main(String[] args) 
    {
        int n=5;     

        for(int r=0 ; r<5 ; r++)    //loop for upper half
        {
            for(int c=0 ; c<=r ; c++)
            {
                System.out.print("* ");
            }

            for(int s=0 ; s<(n-r)-1 ; s++)
            {
                System.out.print("  ");
            } 

            for(int s2=0 ; s2<(n-r)-1 ; s2++)
            {
                System.out.print("  ");
            }

            for(int c2=0 ; c2<=r ; c2++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        //Upper half part completed

        for(int r2=0 ; r2<(n-1) ; r2++)             //Lower Half part 
        {                                           //agr beech mein do 2 dots vhahiye tp poore poore triangle to n-1 ko n krdo hr jgh or  <= ko < krdo
            for(int c3=0 ; c3<(n-1)-r2 ; c3++)
            {
                System.out.print("* ");
            }

            for(int s3=0 ; s3<=r2 ; s3++)
            {
                System.out.print("  ");
            }

            for(int s4=0 ; s4<=r2 ; s4++)
            {
                System.out.print("  ");
            }

            for(int c4=0 ; c4<(n-1)-r2 ; c4++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
        //Lower half part completed
    }
}

// * s s s s     s s s s * 
// * * s s s     s s s * *
// * * * s s     s s * * *
// * * * * s     s * * * *
// * * * * *  +  * * * * *
                
// * * * * s  +  s * * * * 
// * * * s s     s s * * * 
// * * s s s     s s s * * 
// * s s s s     s s s s * 