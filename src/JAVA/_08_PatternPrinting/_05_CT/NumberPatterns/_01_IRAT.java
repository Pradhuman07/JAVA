//Number ke liye ek alg variable 
//Kbhi bhi no. ko rows aur columns ke sath mix mt krna

package JAVA._08_PatternPrinting._05_CT.NumberPatterns;
import java.util.Scanner;

public class _01_IRAT 
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows:");    //remeber,println is like cout<<"Enter ..."<<endl; i.e cursor statement print hone ke baad neeche aayega 

        Scanner ref = new Scanner(System.in);
        int n=ref.nextInt();
        
        for(int r=1 , X=1 ; r<=n ; r++ , X+=2)
        {
            for(int c=1 ; c<=r ; c++)
            {
                System.out.print(X + " ");
            }

            System.out.println();
        }
    }    
}