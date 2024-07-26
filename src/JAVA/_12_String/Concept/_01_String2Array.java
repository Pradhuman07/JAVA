package JAVA._12_String.Concept;
import java.util.Arrays;
public class _01_String2Array {
    public static void main(String[] args) {

//-----------------------------------------------------------------
        //i)String into character array:-

        String s = "Hello Bhai";
        char[] ch = s.toCharArray();      // ch[] = [H,e,l,l,o, ,B,h,a,i]
        System.out.println(Arrays.toString(ch));   //ya for each lgalo ya fori lagalo just like an array
//-----------------------------------------------------------------
        //ii)String into words array:-

        String str = "Hello Bhai Kya haal";
        String[] word = str.split(" ");      //word[] = ["Hello","Bhai","Kya","haal"]
        System.out.println(Arrays.toString(word));
//-----------------------------------------------------------------
//        String wordd = str.split(" ");           //error:-required String assigned String[]
    }
}