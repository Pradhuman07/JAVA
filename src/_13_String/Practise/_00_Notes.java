package _13_String.Practise;
import java.util.Arrays;
public class _00_Notes {
    public static void main(String[] args) {

        String str = "Hello Buddy ";
//---------------------------------------------------------------------------
        System.out.println(str.length());    //12
        System.out.println(str.charAt(0));   //H
        System.out.println(str.charAt(str.length()-1));    //" "
//---------------------------------------------------------------------------
        System.out.println(str.trim());    //"Hello Buddy"
//---------------------------------------------------------------------------
//        System.out.println((int)'H');       //72
//        System.out.println((int)'h');       //104
//---------------------------------------------------------------------------
        System.out.println(str.compareTo("Hello Buddy "));   //0
        System.out.println(str.compareTo("hello Buddy "));   //-32 (H-h)  (H=65+7=72 , h=97+7=104)
        System.out.println(str.compareTo("Hello Auddy "));   //1  (B-A = 66-65=1)
//---------------------------------------------------------------------------
        System.out.println(str.equals("Hello Buddy "));      //str.compareto(target); returns integer value..basically compares ASCII values for each character
        System.out.println(str.equals("Hello noddy"));       //str.equals(target); returns boolean value
//---------------------------------------------------------------------------
        System.out.println(str.toUpperCase());   //"hello buddy "
        System.out.println(str.toLowerCase());   //"HELLO BUDDY "
//---------------------------------------------------------------------------
//  i]String to character array:-
        char[] ch = str.toCharArray();      // ch = { H, e, l, l, o,  , B, u, d, d, y,  }
        System.out.println(Arrays.toString(ch));   //ya for each lgalo ya fori lagalo just like an array
//---------------------------------------------------------------------------
//        ii]String to word array:-


        
    }
}
