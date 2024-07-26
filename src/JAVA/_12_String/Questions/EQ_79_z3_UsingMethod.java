package JAVA._12_String.Questions;

import java.util.Arrays;

public class EQ_79_z3_UsingMethod {

    private static String capitalizeEachWord(String word) {
        char[] ch = word.toCharArray();
        ch[0] =  Character.toUpperCase(ch[0]);
        ch[ch.length-1] =  Character.toUpperCase(ch[ch.length-1]);
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "Hello      bhai kaise Ho a      ";

        String[] words = s.split(" ");

        System.out.println(Arrays.toString(words));
        System.out.println(words[3]);
        System.out.println(words[3].length());
        System.out.println(words.length);

        System.out.println(words[words.length-1]);
        System.out.println(words[words.length-1].length());

//        String ans = "";
//
//        for(String word : words)
//            if(word.length()>0)
//                ans = ans + capitalizeEachWord(word) + " ";
//
//        System.out.println(ans.trim());
    }
}