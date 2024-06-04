package _12_String.Questions;
import java.util.Arrays;
public class EQ_71_UsingForEach {
    public static void main(String[] args) {
        String str = "Hello Buddy";

        for(char ch : str.toCharArray())    //direct  //Remember:- For Each Only works with Array
            System.out.println(ch);
//-----------------------------------------------------------------------------------
        char[] ch = str.toCharArray();      //first make array then
//-----------------------------------------------------------------------------------
        System.out.println(Arrays.toString(ch));    //Either print using toString

        for(char c : ch)                    //Either Print using For Each
            System.out.println(c);

        for(int i=0 ; i<ch.length ; i++)    //Either print using For
            System.out.println(ch[i]);
    }
}