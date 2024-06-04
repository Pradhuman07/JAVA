//78- Accept a space seperated sentence and split in into words. Print each word on a new line with first letter capitalized.
//      IN-        Hello bhai kaise ho
//      OP-        Hello
//                 Bhai
//                 Kaise
//                 Ho

package _12_String.Questions;
public class EQ_78 {

    public static void main(String[] args) {
        String sentence = "Hello bhai kaise ho";

        String[] arr = sentence.split(" ");

        for(String word : arr)
            System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1));

    }
}