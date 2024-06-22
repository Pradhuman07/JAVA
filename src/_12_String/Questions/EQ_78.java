//78- Accept a space seperated sentence and split in into words. Print each word on a new line with first letter capitalized.
//      IN-        Hello bhai kaise ho
//      OP-        Hello
//                 Bhai
//                 Kaise
//                 Ho
package _12_String.Questions;
public class EQ_78 {
    public static void main(String[] args) {
        String str = "Hello      bhai kaise ho a";     //String

        String[] arr = str.split(" ");      //String Array

        for(String word : arr)
            if(word.length()>0)
             System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1));

    }
}