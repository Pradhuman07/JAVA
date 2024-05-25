package _13_String.Practise;
import java.util.Arrays;
public class EQ_71_UsingForEach {
    public static void main(String[] args) {
        String str = "Hello Buddy";

        for(char ch : str.toCharArray())    //direct way
            System.out.println(ch);

        char[] ch = str.toCharArray();      //first make array then procceding

        for(char c : ch)                    //Printing Array using for each
            System.out.println(c);

        for(int i=0 ; i<ch.length ; i++)    //Printing array using fori
            System.out.println(ch[i]);

        System.out.println(Arrays.toString(ch));    //Printing array using toString
    }
}
//for each loop only works with array