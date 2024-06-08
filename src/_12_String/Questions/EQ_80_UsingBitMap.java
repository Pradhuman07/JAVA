package _12_String.Questions;
import java.util.Arrays;
public class EQ_80_UsingBitMap {
    public static void main(String[] args) {
        String s = "orbhaikeseho";

        int[] freq = new int[26];      //Default value all element = 0 //26 letters hote h na a-z = index 0-25 ..length = 26

        for(char ch : s.toCharArray())   //o,a,b,h,a,i,k,e,s,e,h,o
            freq[ch-'a']++;              //for a,index = a-a = 0..which means a ki frequency is at index 0,  freq[0]++..freq[0] pe 0 tha ab wo 1 hogya fir dubar jb a aayega to wo 2 hojyega  , b=b-a=1 b is at index =1 i.e b ki frequency is at index 1

        for (int i = 0; i<freq.length; i++)
            if(freq[i]>0)
                System.out.println( (char)(i+'a') + "->" + freq[i] );    //i=1,(char)(i+'a')=(char)(1+'a') = (char)(98) = b

    }
}
//bitmap...fastest in the java even faster than hashmap...Array is the fastest data structure