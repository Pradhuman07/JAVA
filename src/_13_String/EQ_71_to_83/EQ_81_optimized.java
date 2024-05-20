//bitmap...fastest in the java evem faster than hashmap...Array is the fastest data structure
package _13_String.EQ_71_to_83;

import java.util.Arrays;

public class EQ_81_optimized {
    public static void main(String[] args) {
        String s = "orbhaikeseho";
        int[] freq = new int[26];      //26 letters hote h na a-z = index 0-25 ..length = 26

        for(char ch : s.toCharArray()){   //o,a,b,h,a,i,k,e,s,e,h,o
            freq[ch-97]++;                //a=97-97=0 = fre[0]++..freq[0] pe 0 tha ab wo 1 hogya fir dubar jb a aayega to wo 2 hojyega  , b=98-97=1 = freq[1]
        }

        System.out.println(Arrays.toString(freq));

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0)
                System.out.println( (char)(i+97) + "->" + freq[i] );    //i=0,(char)(i+97)=a ; i=1,(char)(i+97)=b
        }
    }
}